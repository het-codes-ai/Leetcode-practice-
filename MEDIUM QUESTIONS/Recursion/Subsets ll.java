import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        find_subsets(0,nums,curr,ans);
        return ans;
    }
    
    public static void find_subsets(int i,int[]nums, List<Integer> curr,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList <>(curr));
            return;
        }
                       
        //adding 
        curr.add(nums[i]);
        find_subsets(i+1,nums,curr,ans);
        
        //backtrack 
        curr.remove(curr.size()-1);
        
        //check if duplicate 
        int j=i+1;
        while(j<nums.length && nums[j]==nums[j-1]){
            j++;
        }
        find_subsets(j,nums,curr,ans);        
        return;
    }
}