// Program: Checks whether a given number is a Duck Number.

import java.util.Scanner;

public class DuckNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number as a String
        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        // Variable to count the number of zeros
        int zeroCount = 0;

        // Check every digit in the number
        for (int index = 0; index < number.length(); index++) {

            if (number.charAt(index) == '0') {
                zeroCount++;
            }
        }

        // A Duck Number contains at least one zero
        // but must not start with zero
        if (zeroCount > 0 && number.charAt(0) != '0') {

            System.out.println(number + " is a Duck Number.");

        } else {

            System.out.println(number + " is NOT a Duck Number.");
        }

        // Close Scanner
        sc.close();
    }
}