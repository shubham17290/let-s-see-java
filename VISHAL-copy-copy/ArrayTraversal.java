// Program: Demonstrates how to access and print
// all elements of an integer array using a loop.

public class ArrayTraversal {

    // Prints all elements of the array
    void printArray() {

        // Integer array
        int[] numbers = {19, 33, 45, 67, 24};

        // Traverse the array
        for (int index = 0; index < numbers.length; index++) {

            System.out.println(numbers[index]);
        }
    }

    public static void main(String[] args) {

        // Create an object
        ArrayTraversal obj = new ArrayTraversal();

        // Call the method
        obj.printArray();
    }
}