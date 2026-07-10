import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prints a heart shape filled with the letters of a supplied soulmate name.
 * The heart consists of two upper semicircles and a lower triangle.
 * The pattern is filled by cycling through the name's characters horizontally.
 *
 * <p>
 * Time Complexity: O(n²) where n is the heart size (the number of rows in the
 * upper half is n, width is about 4n). This is optimal because the output
 * contains O(n²) characters.
 * </p>
 */
public class HeartPattern {

    /** Reader for console input (shared across methods). */
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Entry point. Reads heart size and soulmate name, then displays the heart.
     */
    public static void main(String[] args) {
        int heartSize = inputHeartSize();
        String soulmate = inputSoulmateName();
        displayHeart(heartSize, soulmate);
    }

    /**
     * Prompts the user for a positive integer heart size and returns it.
     * Retries on invalid input.
     *
     * @return the heart size (n)
     */
    private static int inputHeartSize() {
        while (true) {
            try {
                System.out.print("Input your heart size: ");
                String line = reader.readLine();
                int size = Integer.parseInt(line.trim());
                if (size > 0) {
                    return size;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (IOException e) {
                System.err.println("Error reading input: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a positive integer.");
            }
        }
    }

    /**
     * Prompts the user for a non‑empty soulmate name and returns it.
     *
     * @return the name string
     */
    private static String inputSoulmateName() {
        while (true) {
            try {
                System.out.print("Input your soulmate name: ");
                String name = reader.readLine();
                if (name != null && !name.trim().isEmpty()) {
                    return name.trim();
                } else {
                    System.out.println("Name cannot be empty. Please try again.");
                }
            } catch (IOException e) {
                System.err.println("Error reading input: " + e.getMessage());
            }
        }
    }

    /**
     * Draws the heart using the given size and fills it with the name.
     *
     * @param n    the heart size (determines the scale)
     * @param name the string used to fill the heart pattern
     */
    private static void displayHeart(int n, String name) {
        if (name == null || name.isEmpty()) {
            return; // nothing to print
        }

        int nameLen = name.length();
        int charIndex = 0; // cycles through the name

        // ----- Upper part: two semicircles (arches) -----
        // We use two circle equations: one centered at (n, n) and one at (n, 3n).
        for (int row = 0; row < n; row++) {
            // y is row, x is column (width 0..4n)
            for (int col = 0; col <= 4 * n; col++) {
                double distLeft  = Math.sqrt(Math.pow(row - n, 2) + Math.pow(col - n, 2));
                double distRight = Math.sqrt(Math.pow(row - n, 2) + Math.pow(col - 3 * n, 2));

                // Inside either circle (with a small epsilon to smooth the border)
                if (distLeft < n + 0.5 || distRight < n + 0.5) {
                    System.out.print(name.charAt(charIndex % nameLen));
                    charIndex++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // ----- Lower part: triangle -----
        // Height: 2n rows, each row starts with an increasing indentation
        for (int row = 1; row <= 2 * n; row++) {
            // Print leading spaces
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            // Print characters for the current row
            int colsFilled = 4 * n + 1 - 2 * row;
            for (int col = 0; col < colsFilled; col++) {
                System.out.print(name.charAt(charIndex % nameLen));
                charIndex++;
            }
            System.out.println();
        }
    }
}