// Program: Demonstrates constructors, instance variables,
// and methods in Java.

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

    // Adds the given number to the stored value
    public int add(int number) {
        return value + number;
    }

    // Main method
    public static void main(String[] args) {

        // Create an object using the default constructor
        FirstProgram obj1 = new FirstProgram();

        System.out.println("Stored Value = " + obj1.getValue());
        System.out.println("Addition Result = " + obj1.add(10));

        // Create another object using the parameterized constructor
        FirstProgram obj2 = new FirstProgram(25);

        System.out.println("Stored Value = " + obj2.getValue());
        System.out.println("Addition Result = " + obj2.add(15));
    }
}