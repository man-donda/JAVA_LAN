import java.util.*;

public class tut20_N_QUEENS_PROBLEM {

    public boolean isSafe(int row, int col, char[][] board){
        // Horizontal :
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // Vertical :
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Upper left :
        int r = row; 
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Upper right : 
        r = row; 
        for(int c = col; c < board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower left : 
        r = row; 
        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower right :  
        for(int c = col; c < board.length && r < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true; 
    }

    public void saveBoard(char[][] board, List<List<String>> allBoard){
        
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            String row = "";
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
                newBoard.add(row);
            }
            allBoard.add(newBoard);
        }
    }

    public void helper(char[][] board, List<List<String>> allBoard, int col) {
        if(col == board.length){
            saveBoard(board, allBoard);
            return ;
        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col+1);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoard, 0);
        return allBoard;
    }
    public static void main(String[] args) {
        tut20_N_QUEENS_PROBLEM obj = new tut20_N_QUEENS_PROBLEM();
        List<List<String>> result = obj.solveNQueens(4);
        System.out.println(result);
    }
}
