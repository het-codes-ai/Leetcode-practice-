class Solution {
    
    public void rotate(int[] nums, int k) {        
        int n=nums.length;
        k=k%n;
        int st1=0;
        int end1=n-1;
        while(st1<=end1){
        int temp=nums[st1];
        nums[st1]=nums[end1];
        nums[end1]=temp;
        st1++;
        end1--;        
        }
        int st2=0;
        int end2=k-1;
        while(st2<=end2){
        int temp=nums[st2];
        nums[st2]=nums[end2];
        nums[end2]=temp;
        st2++;
        end2--;        
        }
        int st3=k;
        int end3=n-1;
        while(st3<=end3){
        int temp=nums[st3];
        nums[st3]=nums[end3];
        nums[end3]=temp;
        st3++;
        end3--;        
        }
    return;
    }
}