// Practice program: builds and prints a character matrix pattern.
import java.util.Scanner;

public class arrayExample {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Prompt user for the size of the 2D array
        System.out.print("Enter size: ");
        int n = in.nextInt();

        // Check if the size is within the range of 1-10
        if (n < 1 || n > 10) {
            System.out.println("Size out of Range");
            return;
        }

        // Prompt user for first, second, and third characters
        System.out.print("First Character: ");
        char ch1 = in.next().charAt(0);
        System.out.print("Second Character: ");
        char ch2 = in.next().charAt(0);
        System.out.print("Third Character: ");
        char ch3 = in.next().charAt(0);

        // Initialize 2D array with size n x n
        char m[][] = new char[n][n];

        // Fill in the array with characters based on the conditions
        char x = ch2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if i == j or i + j == n - 1, then set the value to ch3
                if (i == j || (i + j) == n - 1) {
                    m[i][j] = ch3;
                }
                // Check if i == 0 or i == n - 1, then set the value to ch1
                else if (i == 0 || i == n - 1) {
                    m[i][j] = ch1;
                }
                // Check if j == 0 or j == n - 1 or i % 2 == 0, then set the value to ch2
                else if (j == 0 || j == n - 1 || i % 2 == 0) {
                    m[i][j] = ch2;
                }
                // Else set the value to ch1
                else {
                    m[i][j] = ch1;
                }
            }
        }

        System.out.println("OUTPUT:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
