import java.util.Scanner;

public class SpecialNumber {
    
    // Encapsulation: Keep the number secure inside the object
    private int n;

    // Constructor
    public SpecialNumber() {
        this.n = 0;
    }
    
    // Pass the scanner in to avoid locking System.in
    public void read(Scanner sc) {
        System.out.print("Enter a number to check if it's Special: ");
        this.n = sc.nextInt();
    }
    
    // This is an internal math helper, so we make it private
    private int factorial(int x) {
        // Base case protects against 0!
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    
    public boolean isSpecial() {
        int num = n;
        int sum = 0;
        
        while (num > 0) {
            int t = num % 10;
            sum += factorial(t);
            num /= 10; // Shorthand for num = num / 10
        }
        
        // PRO TIP 1: Return the evaluation directly!
        return sum == n;
    }
    
    public void display() {
        // PRO TIP 2: Skip the '== true' check!
        // We can just put the method call directly inside the if-statement.
        if (isSpecial()) {
            System.out.println("\nResult: " + n + " IS a Special number!");
        } else {
            System.out.println("\nResult: " + n + " is NOT a Special number.");
        }
    }
    
    public static void main(String[] args) {
        
        // safely manage the Scanner memory
        try (Scanner sc = new Scanner(System.in)) {
            SpecialNumber ob = new SpecialNumber();
            
            ob.read(sc);
            ob.display();
        }
    }
}