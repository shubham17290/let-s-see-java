// Program: Reads integer array elements from the user and displays them.

import java.util.Scanner;

public class ArrayInputOutputDemo01 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an integer array
        int[] numbers = new int[size];

        // Read array elements from the user
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display the array elements
        System.out.println("\nArray Elements:");

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        // Close the Scanner object
        sc.close();
    }
}