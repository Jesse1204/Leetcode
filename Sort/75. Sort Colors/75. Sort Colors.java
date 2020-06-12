class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int num:nums){
            count[num]++;
        }
        int pointer = 0;
        for(int i=0;i<count.length;i++){
            int cur = count[i];
            while(cur > 0 && pointer<nums.length){
                nums[pointer++] = i;
                cur--;
            }
        }
    }
}