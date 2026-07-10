import java.util.Arrays;

public class ModernSort {
    
    public static void main(String[] args) {
        int[] numbers = {25, 19, 56, 3, 5};
        
        // 1. Instantly sorts the array in ascending order
        Arrays.sort(numbers);
        
        // 2. Arrays.toString() instantly formats and prints the whole array!
        // Output will be: [3, 5, 19, 25, 56]
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}