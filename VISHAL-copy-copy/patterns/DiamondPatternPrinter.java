// Program: Prints a diamond pattern using a user-selected symbol.

import java.util.Scanner;

public class DiamondPatternPrinter {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Read the symbol to print
        System.out.print("Enter the symbol: ");
        char symbol = sc.next().charAt(0);

        // ---------- Upper Half of Diamond ----------
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print symbols
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(symbol);
            }

            // Move to the next line
            System.out.println();
        }

        // ---------- Lower Half of Diamond ----------
        for (int i = rows - 1; i > 0; i--) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print symbols
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(symbol);
            }

            // Move to the next line
            System.out.println();
        }

        // Close the Scanner
        sc.close();
    }
}