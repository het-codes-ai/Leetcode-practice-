class Solution {
    
    private boolean isSafe(char[][] board,int row,int col,char digit){        
        //horizontal 
        for(int j=0;j<9;j++){
            if(board[row][j]==digit){
                return false;
            }
        }        
        //vertical 
        for(int i=0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
        }
        //grid
        int strow=(row/3)*3;
        int stcol=(col/3)*3;
        
        for(int i=strow;i<strow+3;i++){
            for(int j=stcol;j<stcol+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }        
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    private boolean helper(char[][] board,int row,int col){
        if(row==9){
        return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        
        if(nextCol==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col]!='.'){
            return helper(board, nextRow,nextCol);
        }
        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;                
                if(helper(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col]='.';
            }            
        }
        return false;
    }
}