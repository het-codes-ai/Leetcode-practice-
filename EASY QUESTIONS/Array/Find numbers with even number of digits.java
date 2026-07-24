class Solution {
    public int findNumbers(int[] nums) {
        int ans_count=0;
        
        for(int i=0;i<nums.length;i++){
            int digits_count=0;
            while(nums[i]>0){
                digits_count++;
                nums[i]/=10;
            }
            if(digits_count%2==0){
                ans_count++;
            }
        }
        return ans_count;
    }
}