class Solution {
    public void nextPermutation(int[] nums) {
        int pivot =-1;
        int n=nums.length;
        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot!=-1){
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
            int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;             
                break;       
                } 
                }          
        }       
            int st=pivot+1;
            int end=n-1;
            
            while(st<=end){
                int temp=nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;            
        }
    }
}