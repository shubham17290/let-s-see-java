// Program: Reads an integer using BufferedReader
// and prints the number along with its square.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareCalculator {

    public static void main(String[] args) throws IOException {

        // Create a BufferedReader object for user input
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // Read the input as a string
        System.out.print("Enter a number: ");
        String input = br.readLine();

        // Convert the string into an integer
        int number = Integer.parseInt(input);

        // Calculate the square of the number
        double square = Math.pow(number, 2);

        // Display the results
        System.out.println("Number = " + number);
        System.out.println("Square = " + square);
    }
}