// Program: Demonstrates the use of instance variables,
// constructors, and methods in Java.

public class FirstProgram {

    // Instance variable that stores a value
    private int value;

    // Default constructor
    public FirstProgram() {
        value = 0;
    }

    // Parameterized constructor
    public FirstProgram(int value) {
        this.value = value;
    }

    // Returns the stored value
    public int getValue() {
        return value;
    }

    // Updates the stored value
    public void setValue(int value) {
        this.value = value;
    }

    // Adds a number to the stored value and returns the result
    public int add(int number) {
        return value + number;
    }
}