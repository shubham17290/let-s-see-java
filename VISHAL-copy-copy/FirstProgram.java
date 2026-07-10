
// Practice program: simple class with a stored value and sample addition method.
/**
 * Demonstrates a simple stored value and a method that adds to it.
 *
 * Useful as a small starter class for practicing constructors and methods.
 */
public class FirstProgram
{
    // Stores the base value used by sampleMethod.
    private int x;

    /**
     * Constructor for objects of class FirstProgram
     */
    public FirstProgram()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Adds the supplied value to the stored value.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        return x + y;
    }
}
