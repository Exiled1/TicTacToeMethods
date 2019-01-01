package ticTacToeMethods;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
//DO NOT MODIFY THIS FILE.  JUST USE IT TO RUN THE UNIT TEST
public class TicTacToeTestClearBoard {
    @Test public void testClearBoard100() {check(0, 0);}
    @Test public void testClearBoard101() {check(0, 1);}
    @Test public void testClearBoard102() {check(0, 2);}
    @Test public void testClearBoard103() {check(1, 0);}
    @Test public void testClearBoard104() {check(1, 1);}
    @Test public void testClearBoard105() {check(1, 2);}
    @Test public void testClearBoard106() {check(2, 0);}
    @Test public void testClearBoard107() {check(2, 1);}
    @Test public void testClearBoard108() {check(2, 2);}
    public static String messageString(String message, int [][] board) {
        for (int []row : board) {
            message += Arrays.toString(row) + "\n";            
        }
        return message;
    }
    public static void check(int row, int col) {
        int [][]board = {
                {1, 2, 1},
                {1, 1, 1},
                {1, 1, 2}};
        
        TicTacToeMethods.clearBoard(board);
        int value = board[row][col];
        
        String message = messageString("Expected all entries to be zero after calling clearBoard.  Actual array after calling clearBoard:\n", board);
        if (value != 0) {
            System.err.println(message);
        }
        assertEquals(message, value, 0);
    }
}
