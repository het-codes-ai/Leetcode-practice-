class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        int st=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=nums[end];
                end--;
            }
            else{
                sum-=nums[st];
                st++;
            }
        }
        return sum;
    }
}
