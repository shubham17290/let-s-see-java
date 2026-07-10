import java.util.Scanner;

public class FactorialCalculator0 {
    
    // Making this 'static' means it belongs to the class itself.
    // We no longer need to create an object to use this method!
    // Changing 'int' to 'long' prevents the math from breaking for numbers > 12.
    public static long factorial(long n) {
        // Adding n == 1 is a tiny optimization to stop one step earlier
        if (n == 0 || n == 1) { 
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        
        // try-with-resources prevents the memory leak
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a number to find its factorial: ");
            long number = sc.nextLong();
            
            // Notice how clean this is? No 'new FactorialCalculator()' needed!
            long fact = factorial(number);
            
            System.out.println("Factorial of " + number + " = " + fact);
        }
    }
}