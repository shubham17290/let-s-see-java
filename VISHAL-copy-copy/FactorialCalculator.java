// Program: Calculates the factorial of a number using
// an instance method and recursion.

import java.util.Scanner;

public class FactorialCalculator {

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

        // Create an object to call the instance method
        FactorialCalculator calculator = new FactorialCalculator();

        // Calculate factorial
        long factorial = calculator.factorial(number);

        // Display the result
        System.out.println("Factorial of " + number + " = " + factorial);

        // Close the Scanner
        sc.close();
    }

    // Recursive instance method to calculate factorial
    long factorial(int number) {

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }
}