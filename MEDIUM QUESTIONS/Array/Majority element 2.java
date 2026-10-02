class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        if(nums==null || nums.length==0){
            return ans;
        }
        
        Integer major1=null;
        Integer major2=null;
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){
            if(major1!=null && major1==nums[i]){
                count1++;
            }
            else if(major2!=null && major2==nums[i]){
                count2++;
            }
            else if(count1==0){
                major1=nums[i];
                count1=1;
            }
            else if(count2==0){
                major2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
           if(major1!=null && nums[i]==major1){
               count1++;
           }
            else if(major2!=null && nums[i]==major2){
                count2++;
            }
        }

        int min_limit=nums.length/3;
        if(count1>min_limit){
            ans.add(major1);
        }
        if(count2>min_limit){
            ans.add(major2);
        }
        return ans;
    }
}