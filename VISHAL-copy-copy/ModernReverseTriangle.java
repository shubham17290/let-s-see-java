import java.util.Scanner;

public class ModernReverseTriangle {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            
            System.out.println("\n--- Modern Java Triangle ---");
            
            // We still use the outer loop to count down the rows...
            for (int i = rows; i >= 1; i--) {
                
                // ...but we use .repeat() instead of an inner loop to print the stars!
                // If i is 5, it instantly prints "* * * * * "
                System.out.println("* ".repeat(i));
            }
        }
    }
}