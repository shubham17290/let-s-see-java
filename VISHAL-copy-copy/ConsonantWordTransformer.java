// Program: Moves all consonants before vowels
// and converts consonants to uppercase.

import java.util.Scanner;

public class ConsonantWordTransformer {

    // Stores the input word and its length
    private String word;
    private int length;

    // Constructor: Initializes default values
    public ConsonantWordTransformer() {
        word = "";
        length = 0;
    }

    // Reads a word from the user
    void readWord() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = sc.next().toLowerCase();

        length = word.length();

        // Close the Scanner
        sc.close();
    }

    // Moves all consonants before vowels
    void shiftConsonants() {

        String shiftedWord = "";

        for (int i = 0; i < length; i++) {

            char currentChar = word.charAt(i);

            if (currentChar != 'a' &&
                currentChar != 'e' &&
                currentChar != 'i' &&
                currentChar != 'o' &&
                currentChar != 'u') {

                shiftedWord += currentChar;
            }
        }

        for (int i = 0; i < length; i++) {

            char currentChar = word.charAt(i);

            if (currentChar == 'a' ||
                currentChar == 'e' ||
                currentChar == 'i' ||
                currentChar == 'o' ||
                currentChar == 'u') {

                shiftedWord += currentChar;
            }
        }

        word = shiftedWord;

        System.out.println("Shifted Word = " + word);
    }

    // Converts consonants to uppercase
    void capitalizeConsonants() {

        String changedWord = "";

        for (int i = 0; i < length; i++) {

            char currentChar = word.charAt(i);

            if (currentChar != 'a' &&
                currentChar != 'e' &&
                currentChar != 'i' &&
                currentChar != 'o' &&
                currentChar != 'u') {

                changedWord += Character.toUpperCase(currentChar);

            } else {

                changedWord += currentChar;
            }
        }

        word = changedWord;

        System.out.println("Changed Word = " + word);
    }

    // Displays the original, shifted, and transformed words
    void displayResult() {

        System.out.println("Original Word = " + word);

        shiftConsonants();

        capitalizeConsonants();
    }

    // Main method
    public static void main(String[] args) {

        ConsonantWordTransformer obj = new ConsonantWordTransformer();

        obj.readWord();

        obj.displayResult();
    }
}