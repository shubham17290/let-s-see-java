// Program: Checks whether a given number is an Armstrong number (3-digit version).

import java.util.Scanner;

class ArmstrongNumberChecker {

    public static void main(String[] args) {

        // Variables used in the program
        int number, remainder, sum = 0;

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Store the original number for comparison later
        int originalNumber = number;

        // Extract each digit and calculate the sum of cubes
        while (number > 0) {

            // Get the last digit
            remainder = number % 10;

            // Add the cube of the digit to the sum
            sum = sum + (remainder * remainder * remainder);

            // Remove the last digit
            number = number / 10;
        }

        // Check whether the calculated sum is equal to the original number
        if (sum == originalNumber)
            System.out.println(originalNumber + " is an Armstrong Number.");
        else
            System.out.println(originalNumber + " is NOT an Armstrong Number.");

        // Close the Scanner object
        sc.close();
    }
}