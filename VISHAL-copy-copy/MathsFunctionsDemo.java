// Program: Demonstrates the use of Math.pow() and Math.max() methods.

class MathFunctionsDemo {

    // Method to calculate the square of a number
    // and find the maximum of two numbers.
    void print(int x, int y, int z) {

        // Math.pow(x, 2) returns x raised to the power of 2.
        double square = Math.pow(x, 2);

        // Math.max(x, y) returns the larger value between x and y.
        double maximum = Math.max(x, y);

        // Display the results.
        System.out.println("Square of " + x + " = " + square);
        System.out.println("Maximum of " + x + " and " + y + " = " + maximum);

        // Note:
        // The parameter 'z' is currently not used in this program.
    }

    // Main method: Program execution starts here.
    public static void main(String[] args) {

        // Create an object of the class.
        MathFunctionsDemo obj = new MathFunctionsDemo();

        // Call the print() method.
        obj.print(5, 10, 15);
    }
}