class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];                      
        } 
        int left=0;
        for(int i=0;i<n;i++){
            int right=totalsum-left-nums[i];
            if(right==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}