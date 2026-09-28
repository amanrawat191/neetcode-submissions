class Solution {
    public boolean isValidSudoku(char[][] board) {
        for ( int i = 0 ; i<board.length ; i++){
            for ( int j = 0 ; j<board.length; j++){
                if(!check(board,i,j)){
              return false; 
                }
            }
        }
        return true; 
    }
    public boolean check ( char[][]board,int row,int col){
           //'.'will be valid everytime so no need to check it 
        if(board[row][col]!='.'){
            //1st check row and column of whole sudoku
        for(int i = 0 ; i<board.length; i++){
            if(board[row][col]==board[row][i]&&i!=col){
                return false; 
            }
            if(board[row][col]==board[i][col]&&i!=row){
                return false; 
            }
        }
        int startingRow= (row/3)*3; 
        int startingColumn=(col/3)*3; 
        for(int i =startingRow; i<startingRow+3; i++){
            for(int j = startingColumn; j<startingColumn+3; j++){
                if(board[i][j]==board[row][col]&&i!=row&&j!=col){
                    return false; 
                }
            }
        }}
        return true; 
    }
}
