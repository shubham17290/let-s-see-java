// Program: Finds the largest of three integers
// using the ternary operator.

public class LargestOfThree {

    // Returns the largest of three numbers
    public int findLargest(int first, int second, int third) {

        // Compare the first two numbers
        int largest = (first > second) ? first : second;

        // Compare the largest value with the third number
        largest = (largest > third) ? largest : third;

        return largest;
    }

    public static void main(String[] args) {

        // Create an object
        LargestOfThree obj = new LargestOfThree();

        // Display the largest number
        System.out.println("Largest Number = " +
                obj.findLargest(5, 69, 8));
    }
}