// Practice program: reads and displays an integer array.
import java.util.*;

public class arraytest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Array elements are:- ");
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}
