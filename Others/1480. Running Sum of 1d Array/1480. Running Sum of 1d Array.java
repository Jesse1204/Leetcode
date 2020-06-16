class Solution {
    public int[] runningSum(int[] nums) {
        if(nums==null || nums.length==0) return new int[]{};
        int[] res = new int[nums.length];
        int preSum = 0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            res[i] = preSum;
        }
        return res;
    }
}