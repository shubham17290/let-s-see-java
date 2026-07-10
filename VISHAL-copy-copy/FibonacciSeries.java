// Program: Prints the Fibonacci series up to the specified number of terms.

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // Check for invalid input
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        // First two Fibonacci numbers
        int first = 0;
        int second = 1;
        int nextTerm;

        System.out.println("Fibonacci Series:");

        // Generate the Fibonacci series
        for (int count = 0; count < terms; count++) {

            if (count == 0) {
                nextTerm = first;
            }
            else if (count == 1) {
                nextTerm = second;
            }
            else {
                nextTerm = first + second;
                first = second;
                second = nextTerm;
            }

            System.out.print(nextTerm + " ");
        }

        System.out.println();

        // Close the Scanner
        sc.close();
    }
}