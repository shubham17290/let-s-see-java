import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A utility class that provides operations for checking BUZZ numbers
 * and computing the Greatest Common Divisor (GCD) of two integers.
 *
 * <p>
 * Time complexities:
 * <ul>
 *   <li><b>BUZZ check:</b> O(1) – two simple arithmetic checks.</li>
 *   <li><b>GCD:</b> O(log min(a, b)) – Euclidean algorithm reduces the
 *       numbers quickly.</li>
 * </ul>
 * </p>
 */
public class NumberOperations {

    /**
     * Computes the greatest common divisor (GCD) of two non‑negative integers
     * using the iterative Euclidean algorithm.
     *
     * @param a first number (must be non‑negative)
     * @param b second number (must be non‑negative)
     * @return the GCD of a and b; if both are 0, returns 0 by convention.
     * @throws IllegalArgumentException if either argument is negative
     */
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed for GCD.");
        }

        // Euclidean algorithm: while the second number is not zero
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;   // When b becomes 0, a holds the GCD
    }

    /**
     * Checks whether a number is a BUZZ number.
     * A number is a BUZZ number if it is divisible by 7 or its last digit is 7.
     *
     * @param number the integer to test
     * @return {@code true} if the number is a BUZZ number, {@code false} otherwise
     */
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    /**
     * Entry point – displays a menu and performs the chosen operation.
     * Input is read from the console.
     */
    public static void main(String[] args) {
        // try‑with‑resources ensures the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            displayMenu();

            int choice = readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1:
                    handleBuzzCheck(scanner);
                    break;
                case 2:
                    handleGcdCalculation(scanner);
                    break;
                default:
                    System.out.println("Wrong Choice!!");
                    break;
            }
        }
    }

    /**
     * Prints the menu options to the console.
     */
    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. BUZZ number");
        System.out.println("2. GCD of two numbers");
    }

    /**
     * Handles the BUZZ number check: reads an integer and prints whether it is a BUZZ number.
     */
    private static void handleBuzzCheck(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = readInt(scanner, "");
        if (isBuzz(number)) {
            System.out.println(number + " is a BUZZ number");
        } else {
            System.out.println(number + " is not a BUZZ number");
        }
    }

    /**
     * Handles the GCD calculation: reads two integers, computes their GCD, and prints the result.
     */
    private static void handleGcdCalculation(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        int num1 = readInt(scanner, "");
        int num2 = readInt(scanner, "");
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " : " + result);
    }

    /**
     * Reads an integer from the scanner, retrying on invalid input.
     *
     * @param scanner the input source
     * @param prompt  prompt to display before reading (if non‑empty)
     * @return the integer entered by the user
     */
    private static int readInt(Scanner scanner, String prompt) {
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next(); // discard the invalid token
            }
        }
    }
}