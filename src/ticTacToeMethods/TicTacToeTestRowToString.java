package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TicTacToeTestRowToString {
    @Test public void testCheckRowToString101() {check(0, 0, 1, 2, " |X|O");}
    @Test public void testCheckRowToString102() {check(0, 1, 1, 2, "X|X|O");}
    @Test public void testCheckRowToString103() {check(0, 2, 1, 1, "O|X|X");}
    @Test public void testCheckRowToString104() {check(0, 1, 1, 1, "X|X|X");}
    @Test public void testCheckRowToString105() {check(0, 2, 2, 2, "O|O|O");}
    @Test public void testCheckRowToString106() {check(1, 0, 1, 2, " |X|O");}
    @Test public void testCheckRowToString107() {check(1, 1, 1, 2, "X|X|O");}
    @Test public void testCheckRowToString108() {check(1, 2, 1, 1, "O|X|X");}
    @Test public void testCheckRowToString109() {check(1, 1, 1, 1, "X|X|X");}
    @Test public void testCheckRowToString110() {check(1, 2, 2, 2, "O|O|O");}
    @Test public void testCheckRowToString111() {check(2, 0, 1, 2, " |X|O");}
    @Test public void testCheckRowToString112() {check(2, 1, 1, 2, "X|X|O");}
    @Test public void testCheckRowToString113() {check(2, 2, 1, 1, "O|X|X");}
    @Test public void testCheckRowToString114() {check(2, 1, 1, 1, "X|X|X");}
    @Test public void testCheckRowToString115() {check(2, 2, 2, 2, "O|O|O");}
    public static void genericCheck(int row, int [][]board, String expectedResult) {
        String result = TicTacToeMethods.rowToString(row, board);
        String message = TicTacToeTestClearBoard.messageString("Expected rowToString to return \"" + expectedResult + "\" for row " + row + " instead returned \"" + result + "\" board used:\n", board);
        boolean equals = result.equals(expectedResult);
        if (equals == false) {
            System.err.println(message);
        }
        assertEquals(message, result, expectedResult);               
    }
    public static void check(int row, int val0, int val1, int val2, String expectedResult) {
        int [][]board = new int [3][3];
        board[row][0] = val0;
        board[row][1] = val1;
        board[row][2] = val2;
        genericCheck(row, board, expectedResult);
    } 
    
}
