class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int i = 0 , j = n, pointer = 0;
        while(i<n && j<2*n){
            res[pointer++] = nums[i];
            res[pointer++] = nums[j];
            i++;
            j++;
        }
        return res;
    }
}