package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// DO NOT MODIFY THIS FILE.  DO ALL YOUR WORK IN TicTacToeMethods.java!!!
public class TicTacToeTestExtraCredit {

    @Test public void testClearExtraCredit() {        
        int [][]board = {
                {1, 2, 1, 1},
                {1, 1, 1, 2},
                {1, 1, 2, 1},
                {2, 1, 2, 2}};

        TicTacToeMethods.clearBoard(board);
        boolean allZero = true;
        for (int [] row : board) {
            for (int value : row) {
                if (value != 0) {
                    allZero = false;
                }
            }
        }

        String message = TicTacToeTestClearBoard.messageString("Expected all entries to be zero after calling clearBoard.  Actual array after calling clearBoard:\n", board);
        if (allZero != true) {
            System.err.println(message);
        }
        assertEquals(message, allZero, true);
    }

    @Test public void testCheckForFullBoardExtraCredit1() {testCheckForFullBoardExtraCreditCheck(5, 3);}
    @Test public void testCheckForFullBoardExtraCredit2() {testCheckForFullBoardExtraCreditCheck(-1, -1);}
    public void testCheckForFullBoardExtraCreditCheck(int row, int col) {
        int [][]board = {
                {1, 2, 1, 1},
                {1, 1, 1, 2},
                {1, 1, 2, 1},
                {2, 1, 2, 1}, 
                {2, 1, 2, 1},
                {2, 1, 2, 1}};
        TicTacToeTestCheckForFullBoard.genericCheck(row, col, board);
    }
    @Test public void testCheckRowWinExtraCredit5() {testRowWinExtraCredit(4, 1);}
    @Test public void testCheckRowWinExtraCredit6() {testRowWinExtraCredit(5, 0);}
    public void testRowWinExtraCredit(int row, int expectedResult) {        
        int [][]board = {
                {1, 2, 1, 1, 1, 2},
                {1, 1, 1, 2, 1, 2},
                {1, 1, 2, 1, 1, 1},
                {2, 1, 2, 1, 2, 1}, 
                {1, 1, 1, 1, 1, 1},
                {2, 1, 2, 1, 2, 0}};
        TicTacToeTestCheckRowWin.genericCheck(row, board, expectedResult);
        
    }

}

