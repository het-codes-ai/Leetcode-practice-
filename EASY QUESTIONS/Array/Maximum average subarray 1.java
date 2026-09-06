class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum=0;
        int left=0;
        double maxSum=Integer.MIN_VALUE;
        for(int right=0; right<nums.length;right++){
            currentSum+=nums[right];
            if(right-left+1==k){
                maxSum=Math.max(maxSum, currentSum);
                currentSum-=nums[left];
                left++;
            }
        }
        return maxSum/k;
    }
