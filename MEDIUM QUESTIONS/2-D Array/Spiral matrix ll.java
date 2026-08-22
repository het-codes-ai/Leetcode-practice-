class Solution {
    public int[][] generateMatrix(int n) {
        
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int i=1;
        int [][] matrix=new int[n][n];
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                matrix[top][j]=i;
                i++;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                matrix[j][right]=i;
                i++;
            }
            right--;
          if(top<=bottom){
          for(int j=right;j>=left;j--){
              matrix[bottom][j]=i;
              i++;
          }
          }
            bottom--;
            
            if(left<=bottom){
           for(int j=bottom;j>=top;j--){
               matrix [j][left]=i;
               i++;
           }
           }
           left++;           
        
        }
        return matrix;
    }
}
//TC O(m*n)
//SC O(1)