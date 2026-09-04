class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans=new int[2*n];
        int p1=0;
        int p2=n;
        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[p1];
            p1++;         
        }
        for(int i=1;i<2*n;i+=2){
            ans[i]=nums[p2];
            p2++;         
        }
        return ans;
    }
}