class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        int p=ans.size();
        int[] result=new int[p];
        for(int a=0;a<p;a++){
            result[a]=ans.get(a);
        }
        return result;
    }
}