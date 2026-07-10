import java.util.Arrays;
import java.util.Scanner;

public class FastSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter The Word: ");
            char[] arr = sc.next().toUpperCase().toCharArray();
            
            // Instantly sorts the array using O(N log N) time complexity!
            Arrays.sort(arr);
            
            System.out.println("Sorted Word: " + new String(arr));
        }
    }
}