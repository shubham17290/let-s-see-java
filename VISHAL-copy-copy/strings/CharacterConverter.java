// Program: Converts a character to lowercase.

import java.util.Scanner;

class CharacterConverter {

    // Converts the given character to lowercase
    void convertToLowercase(char ch) {

        // Convert uppercase letters to lowercase.
        // Lowercase letters and non-alphabetic characters remain unchanged.
        ch = Character.toLowerCase(ch);

        // Display the converted character
        System.out.println("Lowercase Character: " + ch);
    }

    // Main method: Program execution starts here
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read a character from the user
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Create an object of the class
        CharacterConverter obj = new CharacterConverter();

        // Call the conversion method
        obj.convertToLowercase(ch);

        // Close the Scanner
        sc.close();
    }
}