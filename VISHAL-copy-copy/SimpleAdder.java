/**
 * Demonstrates a simple stored value and a method that adds to it.
 * Useful as a small starter class for practicing constructors and methods.
 */
public class SimpleAdder {
    
    // Using 'final' here is a pro-tip! Since there is no method to change 'x' 
    // after it is created, making it final secures the data. 
    private final int baseValue;

    /**
     * Default constructor (Starts at 0)
     */
    public SimpleAdder() {
        this.baseValue = 0;
    }

    /**
     * Parameterized constructor (Starts at a custom value)
     */
    public SimpleAdder(int startingValue) {
        this.baseValue = startingValue;
    }

    /**
     * Adds the supplied value to the stored base value.
     *
     * @param y  The number to add
     * @return   The sum of the base value and y
     */
    public int add(int y) {
        return this.baseValue + y;
    }

    // A main method so we can run and test our class!
    public static void main(String[] args) {
        // Test 1: Using the default constructor (Starts at 0)
        SimpleAdder adder1 = new SimpleAdder();
        System.out.println("0 + 10 = " + adder1.add(10));

        // Test 2: Using the parameterized constructor (Starts at 50)
        SimpleAdder adder2 = new SimpleAdder(50);
        System.out.println("50 + 10 = " + adder2.add(10));
    }
}