// Program: Demonstrates how to find the length of an initialized array.

class ArrayLengthDemo {

    // Method to display the length of an array
    void print() {

        // Create and initialize an integer array
        int[] numbers = {1, 2, 3, 4};

        // Display the number of elements in the array
        System.out.println("Array Length = " + numbers.length);
    }

    // Main method: Program execution starts here
    public static void main(String[] args) {

        // Create an object of the class
        ArrayLengthDemo obj = new ArrayLengthDemo();

        // Call the print() method
        obj.print();
    }
}