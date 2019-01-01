package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//DO NOT MODIFY THIS FILE.  JUST USE IT TO RUN THE UNIT TEST
public class TicTacToeTestCheckRowWin {

    
    @Test public void testCheckRow101() {check(0, 0, 1, 2, 0);}
    @Test public void testCheckRow102() {check(0, 1, 1, 2, 0);}
    @Test public void testCheckRow103() {check(0, 2, 1, 1, 0);}
    @Test public void testCheckRow104() {check(0, 1, 1, 1, 1);}
    @Test public void testCheckRow105() {check(0, 2, 2, 2, 2);}
    @Test public void testCheckRow106() {check(1, 0, 1, 2, 0);}
    @Test public void testCheckRow107() {check(1, 1, 1, 2, 0);}
    @Test public void testCheckRow108() {check(1, 2, 1, 1, 0);}
    @Test public void testCheckRow109() {check(1, 1, 1, 1, 1);}
    @Test public void testCheckRow110() {check(1, 2, 2, 2, 2);}
    @Test public void testCheckRow111() {check(2, 0, 1, 2, 0);}
    @Test public void testCheckRow112() {check(2, 1, 1, 2, 0);}
    @Test public void testCheckRow113() {check(2, 2, 1, 1, 0);}
    @Test public void testCheckRow114() {check(2, 1, 1, 1, 1);}
    @Test public void testCheckRow115() {check(2, 2, 2, 2, 2);}
    public static void genericCheck(int row, int [][]board, int expectedResult) {
        int result = TicTacToeMethods.checkRowWin(row, board);
        String message = TicTacToeTestClearBoard.messageString("Expected checkRowWin to return " + expectedResult + " for row " + row + " instead returned " + result + " board used:\n", board);
        if (result != expectedResult) {
            System.err.println(message);
        }
        assertEquals(message, result, expectedResult);               
    }
    public static void check(int row, int val0, int val1, int val2, int expectedResult) {
        int [][]board = { 
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3}};
        board[row][0] = val0;
        board[row][1] = val1;
        board[row][2] = val2;
        genericCheck(row, board, expectedResult);
    }
}
