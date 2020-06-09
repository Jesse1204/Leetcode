class Solution {
    int[] wSum;
    Random random;
    public Solution(int[] w) {
        this.random = new Random();
        for(int i=1;i<w.length;i++){
            w[i] += w[i-1];
        }
        this.wSum = w;
    }
    
    public int pickIndex() {
        double index = wSum[wSum.length-1] * Math.random();
        int left = 0, right = wSum.length-1;
        while(left<right){
            int mid = left + (right-left) / 2;
            if(wSum[mid]==index){
                return mid;
            }else if(wSum[mid] < index){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }
}