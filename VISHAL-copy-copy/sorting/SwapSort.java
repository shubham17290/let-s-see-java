import java.util.Scanner;

/**
 * Practice program: Swaps first and last characters, and sorts letters in a word.
 */
public class SwapSort {
    
    // Private instance variables to keep our data secure
    private String word;
    private String swappedWord;
    private String sortedWord;

    // Constructor to initialize empty strings
    public SwapSort() {
        this.word = "";
        this.swappedWord = "";
        this.sortedWord = "";
    }

    // 1. INPUT METHOD: We pass the Scanner in so we don't accidentally close System.in
    public void readWord(Scanner sc) {
        System.out.print("Enter a word: ");
        this.word = sc.next();
    }

    // 2. SWAP METHOD: Slices the string and rearranges the pieces
    public void swapChar() {
        int len = word.length();
        
        // Edge case: If the word is 1 letter or empty, you can't swap anything!
        if (len <= 1) {
            swappedWord = word;
        } else {
            // Get the LAST letter + the MIDDLE part + the FIRST letter
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(len - 1);
            String middle = word.substring(1, len - 1);
            
            swappedWord = lastChar + middle + firstChar;
        }
    }

    // 3. SORT METHOD: Uses an optimized Bubble Sort to alphabetize the letters
    public void sortWord() {
        // Convert the string into an array of characters
        char[] arr = word.toCharArray();
        boolean swapped;
        
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            
            // Push the largest character to the end of the array
            for (int x = 0; x < arr.length - 1 - i; x++) {
                
                // If the left letter is alphabetically greater than the right letter, swap them
                if (arr[x + 1] < arr[x]) {
                    char temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                    swapped = true;
                }
            }
            // If we went through the array and didn't swap anything, it's already sorted!
            if (!swapped) {
                break;
            }
        }
        
        // Convert the sorted character array back into a String
        sortedWord = new String(arr);
    }

    // 4. DISPLAY METHOD: Handles all the printing in one place
    public void display() {
        System.out.println("\n--- Results ---");
        System.out.println("Original word : " + word);
        System.out.println("Swapped word  : " + swappedWord);
        System.out.println("Sorted word   : " + sortedWord);
    }

    // MAIN METHOD: Orchestrates the program
    public static void main(String[] args) {
        // Using try-with-resources to safely manage memory
        try (Scanner sc = new Scanner(System.in)) {
            SwapSort obj = new SwapSort();
            
            obj.readWord(sc); // Read
            obj.swapChar();   // Calculate
            obj.sortWord();   // Calculate
            obj.display();    // Print
        }
    }
}