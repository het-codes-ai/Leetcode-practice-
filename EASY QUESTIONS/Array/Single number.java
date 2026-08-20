//TC O(n)
//SC O(1)class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];          
        }
        return ans;
    }
}
//TC O(n)
//SC O(1)