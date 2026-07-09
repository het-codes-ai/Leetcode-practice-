class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int st=0;
        int end=n-1;
        int ans=0;
              
        while(st<=end){          
            int  temp_ans=Math.min(height[st], height [end])*(end-st);  
         ans=Math.max(ans,temp_ans);           
if(height[st]<height[end]){
                st++;                
            }
            else{
                end--;
            }        
        }
        return ans;     
    }
}