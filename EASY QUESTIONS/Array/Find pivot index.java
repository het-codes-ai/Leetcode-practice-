class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
            prefix [i+1]=prefix[i]+nums[i];            
        } 
        for(int i=0;i<n;i++){
            int right=totalsum-prefix[i]-nums[i];
            if(right==prefix[i]){
                return i;
            }
        }
        return -1;
    }
}