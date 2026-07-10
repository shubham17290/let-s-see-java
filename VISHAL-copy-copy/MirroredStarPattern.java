import java.util.Scanner;

public class MirroredStarPattern {
    
    public static void main(String[] args) {
        
        // This is a "try-with-resources" block. 
        // It automatically closes the Scanner when the block finishes, 
        // even if the program crashes. You never have to write sc.close() again!
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("How many rows do you want in the widest part? ");
            int rows = sc.nextInt();
            
            System.out.println("Here is your pattern....!!!");
            
            // Top half (growing)
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* "); // Cleaned up string concatenation
                }
                System.out.println(); // Removed empty string
            }
            
            // Bottom half (shrinking)
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}