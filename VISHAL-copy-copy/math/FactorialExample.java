// Program: Calculates the factorial of a number using an iterative loop.

import java.util.Scanner;

public class FactorialExample {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for invalid input
        if (number < 0) {

            System.out.println("Factorial is not defined for negative numbers.");

            sc.close();
            return;
        }

        // Variable to store the factorial
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {

            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + number + " = " + factorial);

        // Close the Scanner
        sc.close();
    }
}