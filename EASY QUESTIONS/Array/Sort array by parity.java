class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int st=0;
        int end=nums.length-1;
        while (st<end){
              if(nums[st]%2==1 && nums[end]%2==0){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
            }
            if(nums[st]%2==0){
                st++;
            }
            if(nums[end]%2==1){
                end--;
            }
          
        }
        return nums;
    }
}