
class Solution {
    //Approach 1: DP
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }

    //Approach 2: Recursion
    public int numTrees(int n) {
        if(n==0) return 1;
        return helper(1,n);
    }
    
    private int helper(int start, int end){
        if(start>=end) return 1;
        int sum = 0;
        for(int i=start;i<=end;i++){
            int left = helper(start,i-1);
            int right = helper(i+1,end);
            sum+= left * right;
        }
        return sum;
    }

    //Approach 3: Recursion with memoization
    public int numTrees(int n) {
        if(n==0) return 1;
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return helper(1,n,memo);
    }
    
    private int helper(int start, int end,int[] memo){
        if(start>=end) return 1;
        int sum = 0;
        int left = -1, right = -1;
        for(int i=start;i<=end;i++){
            if(memo[i-start]==-1){
                left = helper(start,i-1,memo);
                memo[i-start] = left;
            }else{
                left = memo[i-start];
            }
            if(memo[end-start]==-1){
                right = helper(i+1,end,memo);
                memo[end-i] = right;
            }else{
                right = memo[end-i];
            }
            sum+= left * right;
        }
        return sum;
    }
}