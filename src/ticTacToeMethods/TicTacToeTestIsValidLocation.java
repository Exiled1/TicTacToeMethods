package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TicTacToeTestIsValidLocation {
    @Test public void testIsValidLocation101() {check(-1, -1, false);}
    @Test public void testIsValidLocation102() {check(-1, 0, false);}
    @Test public void testIsValidLocation103() {check(-1, 1, false);}
    @Test public void testIsValidLocation104() {check(-1, 2, false);}
    @Test public void testIsValidLocation105() {check(-1, 3, false);}
    @Test public void testIsValidLocation106() {check(0, -1, false);}
    @Test public void testIsValidLocation107() {check(0, 0, false);}
    @Test public void testIsValidLocation108() {check(0, 1, true);}
    @Test public void testIsValidLocation109() {check(0, 2, false);}
    @Test public void testIsValidLocation110() {check(0, 3, false);}
    @Test public void testIsValidLocation111() {check(1, -1, false);}
    @Test public void testIsValidLocation112() {check(1, 0, true);}
    @Test public void testIsValidLocation113() {check(1, 1, false);}
    @Test public void testIsValidLocation114() {check(1, 2, false);}
    @Test public void testIsValidLocation115() {check(1, 3, false);}
    @Test public void testIsValidLocation116() {check(2, -1, false);}
    @Test public void testIsValidLocation117() {check(2, 0, false);}
    @Test public void testIsValidLocation118() {check(2, 1, false);}
    @Test public void testIsValidLocation119() {check(2, 2, true);}
    @Test public void testIsValidLocation120() {check(2, 3, false);}
    @Test public void testIsValidLocation121() {check(3, -1, false);}
    @Test public void testIsValidLocation122() {check(3, 0, false);}
    @Test public void testIsValidLocation123() {check(3, 1, false);}
    @Test public void testIsValidLocation124() {check(3, 2, false);}
    @Test public void testIsValidLocation125() {check(3, 3, false);}
    public static void genericCheck(int row, int column, int [][] board, boolean expectedResult) {
        boolean errorThrown = false;
        boolean result = false;
        String message = "Expected isValidLocation to return " + expectedResult + " for row =" + row + ", column = " + column + ", instead ";
        try {
            result = TicTacToeMethods.isValidLocation(row, column, board);
        }catch(ArrayIndexOutOfBoundsException e) {
            errorThrown = true;
            message += "got an out of bounds exception.  Does isValidLocation check row/column is between 0 and 3?";
            System.err.println(message);
            assertEquals(message, errorThrown, false);
        }        
        if (errorThrown == false) {
            message = TicTacToeTestClearBoard.messageString(message + " returned " + result + " board used:\n", board);
            if (result != expectedResult) {
                System.err.println(message);
            }
            assertEquals(message, result, expectedResult);
        }        
    }
    public static void check(int row, int column, boolean expectedResult) {
        int [][]board = {
                {1, 0, 1},
                {0, 1, 1},
                {1, 1, 0}};
        genericCheck(row, column, board, expectedResult);
    }
}
