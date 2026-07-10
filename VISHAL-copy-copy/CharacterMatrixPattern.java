// Program: Creates a square character matrix with
// borders, diagonals, and alternating row patterns.

import java.util.Scanner;

public class CharacterMatrixPattern {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the size of the matrix
        System.out.print("Enter matrix size (1-10): ");
        int size = sc.nextInt();

        // Validate the size
        if (size < 1 || size > 10) {
            System.out.println("Size out of range.");
            sc.close();
            return;
        }

        // Read the three characters
        System.out.print("Enter first character : ");
        char firstChar = sc.next().charAt(0);

        System.out.print("Enter second character : ");
        char secondChar = sc.next().charAt(0);

        System.out.print("Enter third character : ");
        char thirdChar = sc.next().charAt(0);

        // Create a square character matrix
        char[][] matrix = new char[size][size];

        // Fill the matrix according to the given conditions
        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                // Fill both diagonals with the third character
                if (row == col || row + col == size - 1) {

                    matrix[row][col] = thirdChar;
                }

                // Fill the first and last rows with the first character
                else if (row == 0 || row == size - 1) {

                    matrix[row][col] = firstChar;
                }

                // Fill the first/last columns and even rows
                // with the second character
                else if (col == 0 || col == size - 1 || row % 2 == 0) {

                    matrix[row][col] = secondChar;
                }

                // Fill the remaining cells with the first character
                else {

                    matrix[row][col] = firstChar;
                }
            }
        }

        // Display the matrix
        System.out.println("\nGenerated Pattern:\n");

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                System.out.print(matrix[row][col] + "\t");
            }

            System.out.println();
        }

        // Close the Scanner
        sc.close();
    }
}