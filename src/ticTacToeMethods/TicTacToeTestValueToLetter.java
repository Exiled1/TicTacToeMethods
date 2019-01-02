package ticTacToeMethods;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TicTacToeTestValueToLetter {
    @Test public void testValueToLetter100() {check(0, " ");}
    @Test public void testValueToLetter101() {check(1, "X");}
    @Test public void testValueToLetter102() {check(2, "O");}
    public static void check(int value, String expected) {
        String result = TicTacToeMethods.valueToLetter(value);
        boolean equal = result.equals(expected);
        String message = "valueToLetter(" + value + ") returned \"" + result + "\" expected \"" + expected + "\"\n";
        if (equal != true) {
            System.err.println(message);
        }
        assertEquals(message, expected, result);//true, equal);
    }

}
