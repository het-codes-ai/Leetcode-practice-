class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int a=m-1;
        int b=n-1;
        int tl=m+n;
        int c=m+n-1;
        int[] nums3=new int [tl];
        while(c>=0){
            if(a<0){
                nums3[c--]=nums2[b--];
            }
            else if(b<0){
                nums3[c--]=nums1[a--];
            }
            else  if(nums2[b]>=nums1[a]){
                nums3[c]=nums2[b];
                c--;
                b--;
            }
            else if(nums1[a]>nums2[b]){
                nums3[c]=nums1[a];
                c--;
                a--;                
            }
        }
        if(tl%2!=0){
            return nums3[tl/2];
        }
        else{
            return ((nums3[tl/2]+nums3[(tl/2)-1])/2.0);
        }
    }
}