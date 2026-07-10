// Program: Demonstrates the difference between
// post-increment (x++) and pre-increment (++x).

public class IncrementOperatorDemo {

    // Demonstrates increment operators
    public void demonstrateIncrement() {

        // Initialize the variable
        int number = 4;

        System.out.println("Initial value of number = " + number);

        // Post-increment:
        // Uses the current value first, then increments the variable.
        int postIncrement = number++;

        System.out.println("\nAfter Post-Increment (number++):");
        System.out.println("Value used in expression = " + postIncrement);
        System.out.println("Current value of number = " + number);

        // Pre-increment:
        // Increments the variable first, then uses the updated value.
        int preIncrement = ++number;

        System.out.println("\nAfter Pre-Increment (++number):");
        System.out.println("Value used in expression = " + preIncrement);
        System.out.println("Current value of number = " + number);

        // Final expression
        int result = postIncrement + preIncrement + number;

        System.out.println("\nFinal Calculation:");
        System.out.println(postIncrement + " + " + preIncrement + " + " + number + " = " + result);
    }

    public static void main(String[] args) {

        // Create an object of the class
        IncrementOperatorDemo demo = new IncrementOperatorDemo();

        // Call the demonstration method
        demo.demonstrateIncrement();
    }
}