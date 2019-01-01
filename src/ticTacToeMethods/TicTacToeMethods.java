package ticTacToeMethods;

// THIS IS WHERE YOU WILL DO ALL OF YOUR WORK!!  DO NOT MODIFY ANY OTHER FILE
public class TicTacToeMethods {    
    // For all these tests, you can assume a board of size [3][3].
    // Only for extra credit do you need to handle generic sizes.
    
    // Sets all the elements in board to zero
    // tested by the unit test TicTacToeTestClearBoard    
    public static void clearBoard(int [][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }
    
    // Walks through the board, if there is any entry with value 0
    // then return false - there is no tie
    // Return true only if all entries in board are not equal to zero
    // Tested by TicTacToeTestCheckForFullBoard
    public static boolean checkForFullBoard(int [][] board) {
        // You will need to change this to return the correct value
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    
    // Walks through the row number passed in and checks to see if all
    // of the values are the same.  If they are, return that number.
    // If they are not all the same, return 0
    // Example:  row = 0 board = 
    // [1, 2, 1]  <- row 0
    // [1, 1, 1]
    // [1, 1, 2]
    // return 0 because not all the numbers in row 0 match
    // Note how it does not care that there is a match at row 1.  This
    // method only checks one row.  Since we passed in 0, that is all
    // it checks.
    // You do not need to check that rowNumber is within board.
    // Tested by TicTacToeTestCheckRowWin
    public static int checkRowWin(int rowNumber, int [][] board) {
        // You will need to change this return value
        int placeholder = board[rowNumber][0];
        for (int i = 0; i < board[rowNumber].length; i++) {
             if (board[rowNumber][i] != placeholder){
                 return 0;
             }
        }
        return placeholder;
    }
    

    
    public static void main(String [] args ) {       
        // You don't have to do anything in main.  You just need to run the unit tests.
    }
    

}
