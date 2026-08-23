import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();      
        find_permutations(0,nums,ans);
        return ans;
     }
     public static void find_permutations(int idx,int[] nums,List<List<Integer>>ans){
         if(idx==nums.length){ 
         List<Integer>curr=new ArrayList<>();                          
             for(int num:nums){
                 curr.add(num);
             }
             ans.add(curr) ;
             return;
         }
          
         for(int i=idx;i<nums.length;i++){
         int temp1=nums[idx];
         nums[idx]=nums[i];
         nums[i]=temp1;
         
         find_permutations(idx+1,nums,ans);
         
         int temp2=nums[idx];
         nums[idx]=nums[i];
         nums[i]=temp2;       
         }
         return ;
     }
}