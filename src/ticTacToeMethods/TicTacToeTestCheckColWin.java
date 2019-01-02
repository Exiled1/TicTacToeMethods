package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TicTacToeTestCheckColWin {
    @Test public void testCheckCol101() {check(0, 0, 1, 2, 0);}
    @Test public void testCheckCol102() {check(0, 1, 1, 2, 0);}
    @Test public void testCheckCol103() {check(0, 2, 1, 1, 0);}
    @Test public void testCheckCol104() {check(0, 1, 1, 1, 1);}
    @Test public void testCheckCol105() {check(0, 2, 2, 2, 2);}
    @Test public void testCheckCol106() {check(1, 0, 1, 2, 0);}
    @Test public void testCheckCol107() {check(1, 1, 1, 2, 0);}
    @Test public void testCheckCol108() {check(1, 2, 1, 1, 0);}
    @Test public void testCheckCol109() {check(1, 1, 1, 1, 1);}
    @Test public void testCheckCol110() {check(1, 2, 2, 2, 2);}
    @Test public void testCheckCol111() {check(2, 0, 1, 2, 0);}
    @Test public void testCheckCol112() {check(2, 1, 1, 2, 0);}
    @Test public void testCheckCol113() {check(2, 2, 1, 1, 0);}
    @Test public void testCheckCol114() {check(2, 1, 1, 1, 1);}
    @Test public void testCheckCol115() {check(2, 2, 2, 2, 2);}
    public static void genericCheck(int col, int [][]board, int expectedResult) {
        int result = TicTacToeMethods.checkColWin(col, board);
        String message = TicTacToeTestClearBoard.messageString("Expected checkColWin to return " + expectedResult + " for col " + col + " instead returned " + result + " board used:\n", board);
        if (result != expectedResult) {
            System.err.println(message);
        }
        assertEquals(message, expectedResult, result);               
    }
    public static void check(int col, int val0, int val1, int val2, int expectedResult) {
        int [][]board = new int[3][3] ;
        board[0][col] = val0;
        board[1][col] = val1;
        board[2][col] = val2;
        genericCheck(col, board, expectedResult);
    }
}
