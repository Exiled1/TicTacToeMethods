package ticTacToeMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

// THIS IS WHERE YOU WILL DO ALL OF YOUR WORK!!  DO NOT MODIFY ANY OTHER FILE

/**
 * @author linuxx/Rudy Peralta
 */
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
            if (board[rowNumber][i] != placeholder) {
                return 0;
            }

        }
        return placeholder;
    }


    /**
     * @param col
     * @param board
     * @return Checks if there are three numbers with the same value in a column. If there
     * are three numbers with the same value in a column. If there are, it returns
     * that number. If there aren't, it returns 0. It's okay that if there are all
     * 0's it returns 0. EX:
     * 0   1   2
     * [1, |1|, 1]
     * [2, |1|, 2]
     * [2, |1|, 2]
     *
     * Calling checkColWin(1, board) for the above board returns 1.
     */
    public static int checkColWin(int col, int[][] board) {
        int placeholder = board[0][col];

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] != placeholder && placeholder != 0) {
                return 0;
            }
        }
        return placeholder;
    }

    /**
     * @param row
     * @param column
     * @param board
     * @return This method will eventually be used to determine if the row and the column
     * the user wants to add an X or an O is valid. If it's valid it returns true.
     * A valid location is in bounds, and has a zero at that location in the board
     * array. An invalid location is out of bounds or does not have a zero at that
     * location in the board array.
     */
    public static boolean isValidLocation(int row, int column, int[][] board) {
        //First if checks to see if the row & column are less than 0 (out of bounds), or greater than the board length - 1,
        //(which is also out of bounds)
        if ((row < 0 || column < 0) || (row > board.length - 1 || column > board.length - 1)) {
            return false;
        } else if (board[row][column] != 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param row
     * @param board
     * @return Transforms a single row of the board to a String. It won't print anything.
     * Between each character there should be a "|" added. There aren't any spaces around the "|"
     * in that string.
     * Ex:
     * <p>
     * [2,1,0]
     * [2,0,1]
     * [1,1,0]
     * <p>
     * would return for rowToString(0, board):
     * "o|x| "
     * rowToString(1, board):
     * "o| |x"
     * rTS(2,board):
     * "x|x| "
     */
    public static String rowToString(int row, int[][] board) {
        String strBoard = Arrays.toString(board[row]);
        String placeholder = "";
        //TODO: Optimize all of these placeholder.replace calls...
        //I use string.replace to take out all of the fluff instead of using substrings. If theres a better way for it
        //without using things we haven't learned that would be amazing to know about. :)
        placeholder = strBoard.replace("1", "X")
                .replace("2", "O").replace(",", "|")
                .replace(" ", "").replace("0", " ")
                .replace("[", "").replace("]", "");
        System.out.println(placeholder);

        return placeholder; //The placeholder after all the .replace operations is the final product for a completed board.
    }

    /**
     * @param value
     * @return The value passed in will be a 0, 1, or 2.
     * If 0 is passed in it returns a " "
     * If 1: This returns "X"
     * If 2: this returns "O"
     * <p>
     * This could use a switch statement, but I'll use if and returns for now.
     */
    public static String valueToLetter(int value) {
        //Cleaner than multiple if statements or ternary operators checking for the same cases.
        switch (value) {
            case 0:
                return " ";
            case 1:
                return "X";
            case 2:
                return "O";
        }
        return "";
    }

    public static void main(String[] args) {
        // You don't have to do anything in main.  You just need to run the unit tests.
    }
}
