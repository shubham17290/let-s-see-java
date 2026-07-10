import java.util.Scanner;

public class AdvancedSwapper {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter value for A: ");
            int a = sc.nextInt();
            
            System.out.print("Enter value for B: ");
            int b = sc.nextInt();
            
            // Let's say a = 10, b = 20
            
            a = a + b;  // Step 1: a becomes 30 (10 + 20)
            b = a - b;  // Step 2: b becomes 10 (30 - 20). 'b' is now swapped!
            a = a - b;  // Step 3: a becomes 20 (30 - 10). 'a' is now swapped!
            
            System.out.println("\nSwapped like a pro!");
            System.out.println("A = " + a + " | B = " + b);
        }
    }
}