// Program: Checks whether a given number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNumberChecker0 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store the original number
        int originalNumber = number;

        // Count the number of digits
        int digits = String.valueOf(number).length();

        int sum = 0;

        // Calculate the sum of each digit raised to 'digits'
        while (number != 0) {

            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close Scanner
        sc.close();
    }
}