class Solution {
    public int minStartValue(int[] nums) {
        int min=nums[0];
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
            min=Math.min(min,pref[i]);
        }
        return min<0?1-min:1;
    }
}
