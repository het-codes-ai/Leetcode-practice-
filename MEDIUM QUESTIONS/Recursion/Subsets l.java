import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> cur =new ArrayList<>();
        find_subsets(0,nums,cur,ans);
        return ans;
    }
    public static void find_subsets(int index,int[]nums,List<Integer> cur , List<List<Integer>>ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(cur));     
            return;                      
        }
        //adding 
        cur.add(nums[index]);
        find_subsets(index+1,nums,cur,ans);
        
        //backtrack 
        cur.remove(cur.size()-1);
        find_subsets(index+1,nums,cur,ans);
    }
}