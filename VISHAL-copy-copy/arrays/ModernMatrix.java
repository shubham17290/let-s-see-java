import java.util.Arrays;
import java.util.Scanner;

public class ModernMatrix {
    
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 6 integers:");
            
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sc.nextInt(); 
                }
            }
            
            System.out.println("\n--- Printed using Enhanced For-Loops ---");
            // "For every row in the matrix..."
            for (int[] row : matrix) {
                // "For every number in that row..."
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println("\n--- Printed using Arrays.deepToString() ---");
            // This is the absolute fastest 1-line way to print a 2D array for debugging!
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}