import java.util.Scanner;

/**
 * Practice program: Checks if a number is a "Strong/Special Number"
 * (where the sum of the factorials of its digits equals the number itself).
 */
public class SpecialNumberChecker {
    
    // Private variable keeps the number secure inside the object
    private int n;

    // Constructor initializes 'n' to 0
    public SpecialNumberChecker() {
        this.n = 0;
    }
    
    // 1. INPUT METHOD
    // Passing the scanner prevents it from being locked or leaked
    public void read(Scanner sc) {
        System.out.print("Enter a number to check: ");
        this.n = sc.nextInt();
    }
    
    // 2. MATH METHOD: Calculates factorial using recursion
    public int factorial(int x) {
        // Base case: The factorial of 0 is 1. 
        // This is crucial, otherwise numbers with a '0' in them would fail!
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    
    // 3. LOGIC METHOD: Slices the number and checks the sum
    public boolean isSpecial() {
        int num = n;
        int sum = 0;
        
        // Keep slicing off digits until there are none left
        while (num > 0) {
            int digit = num % 10;           // Get the last digit
            int fact = factorial(digit);    // Find its factorial
            sum = sum + fact;               // Add it to our running total
            
            num = num / 10;                 // Remove the last digit from the number
        }
        
        // PRO TIP: Instead of an if/else block, just return the equation!
        // If sum equals n, it returns true. Otherwise, it returns false.
        return sum == n;
    }
    
    // 4. DISPLAY METHOD
    public void display() {
        // Using primitive 'boolean' instead of object 'Boolean'
        boolean isSpecialNumber = isSpecial();
        
        System.out.println("\n--- Result ---");
        if (isSpecialNumber) {
            System.out.println(n + " IS a Special/Strong Number!");
        } else {
            System.out.println(n + " is NOT a Special Number.");
        }
    }    

    // MAIN METHOD: Runs the program
    public static void main(String[] args) {
        // try-with-resources safely closes the input scanner
        try (Scanner sc = new Scanner(System.in)) {
            SpecialNumberChecker sp = new SpecialNumberChecker();
            sp.read(sc);
            sp.display();
        }
    }
}