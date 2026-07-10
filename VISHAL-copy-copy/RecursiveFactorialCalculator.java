// Program: Calculates the factorial of a number using recursion.

import java.util.Scanner;

public class RecursiveFactorialCalculator {

    // Recursive method to calculate factorial
    long factorial(int number) {

        // Base case: 0! and 1! are equal to 1
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number to calculate factorial: ");
        int number = sc.nextInt();

        // Check for invalid input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        // Create an object to call the recursive method
        RecursiveFactorialCalculator calculator = new RecursiveFactorialCalculator();

        // Calculate factorial
        long factorial = calculator.factorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " = " + factorial);

        // Close the Scanner
        sc.close();
    }
}