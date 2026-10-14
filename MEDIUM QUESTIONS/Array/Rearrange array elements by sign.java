class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int p=0;
        int q=1;
        for(int i=0;i<n;i++){
          if(nums[i]>0){
            result[p]=nums[i];
            p+=2;
          }
          else{
            result[q]=nums[i];
            q+=2;
          } 
        }
        return result;
    }
}
