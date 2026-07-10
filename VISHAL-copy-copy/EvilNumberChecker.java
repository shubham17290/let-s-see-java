// Program: Checks whether a given number is an Evil Number.
// An Evil Number has an even number of 1's in its binary representation.

import java.util.Scanner;

public class EvilNumberChecker {

    // Converts a decimal number to its binary representation
    static long convertToBinary(int number) {

        int remainder;
        int placeValue = 1;
        long binary = 0;

        while (number != 0) {

            remainder = number % 2;
            binary += remainder * placeValue;

            number = number / 2;
            placeValue *= 10;
        }

        return binary;
    }

    // Returns true if the number is an Evil Number
    static boolean isEvilNumber(int number) {

        long binary = convertToBinary(number);
        long temp = binary;

        int oneCount = 0;

        // Count the number of 1's in the binary representation
        while (temp != 0) {

            if (temp % 10 == 1) {
                oneCount++;
            }

            temp /= 10;
        }

        // Display binary representation and count of 1's
        System.out.println("Binary Equivalent : " + binary);
        System.out.println("Number of 1's     : " + oneCount);

        // An Evil Number has an even number of 1's
        return oneCount % 2 == 0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Input Number      : " + number);

        // Check whether the number is Evil
        if (isEvilNumber(number)) {
            System.out.println("Output            : Evil Number");
        } else {
            System.out.println("Output            : Not an Evil Number");
        }

        // Close the Scanner
        sc.close();
    }
}