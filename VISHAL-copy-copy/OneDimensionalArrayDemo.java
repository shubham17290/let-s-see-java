import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demonstrates reading and printing a user‑specified one‑dimensional integer array.
 * <p>
 * The program prompts for the array size, reads the elements, and then prints them
 * one per line. Input validation is included to prevent negative sizes and
 * non‑integer tokens. The Scanner is automatically closed using try‑with‑resources.
 * </p>
 * <p>
 * Time Complexity: O(n) — reading n elements and printing n elements each takes
 * linear time, where n is the array size.
 * </p>
 */
public class OneDimensionalArrayDemo {

    public static void main(String[] args) {
        // try‑with‑resources ensures the Scanner is closed even if an exception occurs
        try (Scanner scanner = new Scanner(System.in)) {
            int size = readPositiveInt(scanner, "Enter size of array: ");

            int[] array = new int[size];
            System.out.println("Enter " + size + " array elements:");

            // Populate the array – O(n)
            for (int i = 0; i < size; i++) {
                array[i] = readInt(scanner, "Element " + (i + 1) + ": ");
            }

            // Print the array – O(n)
            System.out.println("Printed array:");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Repeatedly prompts the user until a positive integer is entered.
     *
     * @param scanner the input source
     * @param prompt  the message displayed before reading
     * @return a positive integer
     */
    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
                System.out.println("Size must be positive. Please try again.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard the invalid token
            }
        }
    }

    /**
     * Reads a single integer from the scanner, with retry on invalid input.
     *
     * @param scanner the input source
     * @param prompt  the message displayed before reading
     * @return the integer that was read
     */
    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // clear the invalid token
            }
        }
    }
}