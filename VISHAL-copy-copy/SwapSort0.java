import java.util.Scanner;

/**
 * Practice program: Swaps end characters and sorts letters in a word.
 * Uses Selection Sort and converts input to uppercase.
 */
public class SwapSort0 {
    
    // Private variables to keep our data secure from outside interference
    private String wrd;
    private int len;
    private String swapwrd;
    private String sortwrd;
    
    // Constructor initializes all strings to empty to prevent null pointer errors
    public SwapSort0() {
        wrd = "";
        len = 0;
        swapwrd = "";
        sortwrd = "";
    }
    
    // Reads the word and converts it to uppercase immediately
    public void readWord(Scanner sc) {
        System.out.print("Enter a word: ");
        
        // .toUpperCase() is a great trick to ensure accurate alphabetical sorting!
        wrd = sc.next().toUpperCase(); 
        len = wrd.length();
    }
    
    // Swaps the first and last characters of the word
    public void swapChar() {
        // Changed to <= 1 to prevent crashes if the user inputs an empty string
        if (len <= 1) {
            swapwrd = wrd;
        } else { 
            // Move the last character to the front, and the first to the end.
            swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
        }
    }
      
    // Sorts the characters alphabetically using a Selection Sort approach
    public void sortWord() {
        // Convert string to character array for easy manipulation
        char[] arr = wrd.toCharArray();
        char temp;
        
        // Compare every letter with every other letter after it
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                
                // If the left letter is alphabetically greater, swap them
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Convert the sorted character array back into a string
        sortwrd = new String(arr);
     }
    
     // Displays all the final data in a clean format
     public void display() {
         System.out.println("\n--- Final Results ---");
         System.out.println("Original word : " + wrd);
         System.out.println("Swapped word  : " + swapwrd);
         System.out.println("Sorted word   : " + sortwrd);
     }

     public static void main(String[] args) {
         
         // try-with-resources safely handles the Scanner memory
         try (Scanner sc = new Scanner(System.in)) {
             SwapSort ob = new SwapSort();
             
             // Orchestrating the sequence of events
             ob.readWord(sc);
             ob.sortWord();
             ob.swapChar();
             ob.display();
         }
     }
}