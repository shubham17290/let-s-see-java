/**
 * Demonstrates initialization and printing of a fixed-size one-dimensional integer array.
 * <p>
 * Time Complexity: O(n) for printing, where n is the array size (here n = 5).
 * Since the size is constant, the overall execution time is effectively constant.
 * </p>
 */
public class FixedArrayDemo {

    private static final int ARRAY_SIZE = 5;
    private static final int DEFAULT_VALUE = 12;

    public static void main(String[] args) {
        // Create an array of fixed size
        int[] numbers = new int[ARRAY_SIZE];

        // Initialize all elements with the same value.
        // A loop or Arrays.fill() could also be used, but explicit indexing
        // demonstrates direct element access.
        numbers[0] = DEFAULT_VALUE;
        numbers[1] = DEFAULT_VALUE;
        numbers[2] = DEFAULT_VALUE;
        numbers[3] = DEFAULT_VALUE;
        numbers[4] = DEFAULT_VALUE;

        // Print the array elements separated by spaces
        printArray(numbers);
    }

    /**
     * Prints the elements of an integer array on a single line,
     * separated by a space, and ends with a newline.
     *
     * @param array the array to print
     */
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // clean newline
    }
}