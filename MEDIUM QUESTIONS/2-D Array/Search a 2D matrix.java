class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int strow=0;
        int endrow=m-1;
        boolean ans=false;
        while(strow<=endrow){
            int midrow=strow+(endrow-strow)/2;
            if(target>=matrix[midrow][0] && target<=matrix[midrow][n-1]){
                int st=0;
                int end=n-1;
                while(st<=end){
                    int mid=st+(end-st)/2;                   
                    if(target==matrix[midrow][mid]){
                ans=true;     
                break;   
                    }
                    else if(target<matrix[midrow][mid]){
                        end=mid-1;
                    }
                    else{
                        st=mid+1;
                    }                   
                }
                break;
                
            }
            else if(target<matrix[midrow][0] ){
                endrow=midrow-1;
            }
            else {
                strow=midrow+1;
            }
        }
        return ans;
    }
}