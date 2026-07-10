// Program: Calculates the factorial of a number using recursion.

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for invalid input
        if (number < 0) {

            System.out.println("Factorial is not defined for negative numbers.");

            scanner.close();
            return;
        }

        // Calculate factorial using recursion
        long factorial = factorial(number);

        // Display the result
        System.out.println("Factorial = " + factorial);

        // Close the Scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    static long factorial(int number) {

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }
}