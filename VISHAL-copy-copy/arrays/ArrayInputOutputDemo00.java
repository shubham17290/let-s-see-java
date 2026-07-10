// Program: Reads array elements from the user and prints them.

import java.util.Scanner;

class ArrayInputOutputDemo00 {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an integer array of the given size
        int[] numbers = new int[size];

        // Display the size of the array
        System.out.println("Array Size = " + numbers.length);

        // Read array elements from the user
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display all the array elements
        System.out.println("\nArray Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Close the Scanner object
        sc.close();
    }
}