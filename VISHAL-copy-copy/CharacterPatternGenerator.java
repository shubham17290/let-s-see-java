// Program: Creates and prints a character matrix pattern based on user input.

import java.util.Scanner;

public class CharacterPatternGenerator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Read the size of the square matrix
        System.out.print("Enter the size of the matrix (1-10): ");
        int size = in.nextInt();

        // Validate the input
        if (size < 1 || size > 10) {
            System.out.println("Size out of range.");
            in.close();
            return;
        }

        // Read the three characters used in the pattern
        System.out.print("Enter the first character: ");
        char firstChar = in.next().charAt(0);

        System.out.print("Enter the second character: ");
        char secondChar = in.next().charAt(0);

        System.out.print("Enter the third character: ");
        char thirdChar = in.next().charAt(0);

        // Create the square character matrix
        char[][] pattern = new char[size][size];

        // Fill the matrix according to the required conditions
        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                // Main diagonal or secondary diagonal
                if (row == col || row + col == size - 1) {

                    pattern[row][col] = thirdChar;
                }

                // First or last row
                else if (row == 0 || row == size - 1) {

                    pattern[row][col] = firstChar;
                }

                // First column, last column, or even-numbered row
                else if (col == 0 || col == size - 1 || row % 2 == 0) {

                    pattern[row][col] = secondChar;
                }

                // Remaining cells
                else {

                    pattern[row][col] = firstChar;
                }
            }
        }

        // Display the generated pattern
        System.out.println("\nGenerated Pattern:\n");

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                System.out.print(pattern[row][col] + "\t");
            }

            System.out.println();
        }

        // Close the Scanner
        in.close();
    }
}