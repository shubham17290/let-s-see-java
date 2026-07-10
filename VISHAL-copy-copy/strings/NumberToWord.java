import java.util.Scanner;

/**
 * Practice program: Prints the word name for digits 1 through 5.
 */
public class NumberToWord {

    // A method to print the word based on the number
    public void printNumberWord(int num) {
        
        // The switch statement is the professional way to handle multiple 
        // discrete options for a single variable.
        switch (num) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                // The 'default' case catches anything that wasn't 1-5
                System.out.println("Out of range");
                break;
        }
    }

    public static void main(String[] args) {
        
        // try-with-resources safely closes the scanner
        try (Scanner ob = new Scanner(System.in)) {
            System.out.print("Enter Number (1-5): ");
            int num = ob.nextInt();
            
            NumberToWord converter = new NumberToWord();
            converter.printNumberWord(num);
        }
    }
}