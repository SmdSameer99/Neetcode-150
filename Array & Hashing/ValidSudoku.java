import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.') {
                    // Unique box identifier calculation
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in col " + j) ||
                        !seen.add(number + " in box " + boxIndex)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    //Local boolean function to check if a character is valid in a given row, column, and box
    public boolean isValidSudoku2(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int numIndex = board[i][j] - '1'; // Converts '1'-'9' to 0-8 index
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    
                    // If this number has already been recorded in this row, col, or box
                    if (rows[i][numIndex] || cols[j][numIndex] || boxes[boxIndex][numIndex]) {
                        return false;
                    }
                    
                    // Mark as seen
                    rows[i][numIndex] = true;
                    cols[j][numIndex] = true;
                    boxes[boxIndex][numIndex] = true;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidSudoku sol = new ValidSudoku();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '8', '8', '6', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        boolean isValid = sol.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + isValid);
    }

}
