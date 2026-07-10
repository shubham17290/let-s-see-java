import java.util.Scanner;

/**
 * Practice program: Prompts the user for a number and prints from 1 up to that number.
 */
public class NumberCounter {

    // The main method is the entry point where the program starts running
    public static void main(String[] args) {
        
        // 1. We use a 'try-with-resources' block to open the Scanner. 
        // This automatically closes the Scanner when we are done, preventing memory leaks!
        try (Scanner scanner = new Scanner(System.in)) {
            
            // 2. Prompt the user so they know what the program expects
            System.out.print("Enter a number to count up to: ");
            
            // 3. Read the user's input and store it in a clearly named variable
            int limit = scanner.nextInt();
            
            System.out.println("\n--- Counting from 1 to " + limit + " ---");
            
            // 4. The 'for' loop: 
            //    - Starts at 1 (int i = 1)
            //    - Keeps running as long as 'i' is less than or equal to the limit (i <= limit)
            //    - Increases 'i' by 1 every time the loop finishes (i++)
            for (int i = 1; i <= limit; i++) {
                
                // ALWAYS use curly braces {}, even if it's just one line of code!
                // This prints the current number to the console.
                System.out.println(i);
            }
            
        } // The Scanner is safely and automatically closed right here.
    }
}