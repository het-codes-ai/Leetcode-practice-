class Solution {
    public void moveZeroes(int[] nums) {
        int st=0;
        int end=0;
        while(end<nums.length){
            if(nums[end]!=0){
                int temp=nums[end];
                nums[end]=nums[st];
                nums[st]=temp;
                st++;
            }            
            end++;
        }
        return;
    }
}