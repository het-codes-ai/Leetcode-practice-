class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList <>();
        List<String>current=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0,ans, current,n);
        return ans;
    }
    public static boolean isSafe(char [][] board,int row,int col,int n){
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }           
        }
        return true;
        }
        public static List<String>construct(char [][] board){
            List<String>current=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                current.add(new String(board[i]));
            }            
            return current;
        }
        public static void nQueens (char[][] board,int row,List<List<String>>ans,List<String>current,int n){
            if(row==n){
                ans.add(construct(board));
                return;
            }
            for(int i=0;i<n;i++){
                if(isSafe(board,row,i,n)){
                    board[row][i]='Q';
                
                nQueens(board,row+1,ans, current,n);
                board[row][i]='.';   
                }            
            }            
      }            
}