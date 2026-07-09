class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans=nums[0]; 
        int maxSum=0;
        int st=0;
        
        
       while (st<n){
           maxSum+=nums[st];
           
           if (maxSum>ans){
               ans=maxSum;
           }
           st++;
           if(maxSum<0){
               maxSum=0;
               
           }
           
  
       }
       return ans;
        
    }
}