package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// DO NOT MODIFY THIS FILE.  JUST USE IT TO RUN THE UNIT TEST
public class TicTacToeTestCheckForFullBoard {
    @Test public void testCheckForTie100() {check(0, 0);}
    @Test public void testCheckForTie101() {check(0, 1);}
    @Test public void testCheckForTie102() {check(0, 2);}
    @Test public void testCheckForTie103() {check(1, 0);}
    @Test public void testCheckForTie104() {check(1, 1);}
    @Test public void testCheckForTie105() {check(1, 2);}
    @Test public void testCheckForTie106() {check(2, 0);}
    @Test public void testCheckForTie107() {check(2, 1);}
    @Test public void testCheckForTie108() {check(2, 2);}
    @Test public void testCheckForTie109() {check(-1, -1);}
    public static void genericCheck(int row, int col, int [][] board) {
        
                
        boolean expectedResult = true;
        if (row > -1) {
            board[row][col] = 0;
            expectedResult = false;
        }
        boolean result = TicTacToeMethods.checkForFullBoard(board);
        String message = TicTacToeTestClearBoard.messageString("Expected checkForTie to return " + expectedResult + " instead returned " + result + " board used:\n", board);
        if (result != expectedResult) {
            System.err.println(message);
        }
        assertEquals(message, result, expectedResult);       
        
    }
    public static void check(int row, int col) {
        int [][]board = { 
                {1, 2, 1},
                {2, 1, 1},
                {1, 2, 2}};

        genericCheck(row, col, board);
    }
}
