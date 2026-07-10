/**
 * Prints a fixed sequence of numbers from 1 to 50.
 * <p>
 * Time Complexity: O(1) – the loop executes exactly 50 times, independent of any input size.
 * This is constant time because the number of operations does not scale with input.
 * </p>
 */
public class NumberPrinter0 {

    /**
     * Prints numbers from 1 to 50 (inclusive), each separated by two spaces.
     * A final newline is appended for clean output.
     */
    public static void printNumbers1To50() {
        // Loop from 1 to 50 and print each number followed by a double space
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + "  ");
        }
        // Move to a new line after printing the sequence
        System.out.println();
    }

    /**
     * Simple entry point to demonstrate the number printing.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        printNumbers1To50();
    }
}