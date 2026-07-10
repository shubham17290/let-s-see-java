/**
 * A utility class to evaluate academic grades based on percentage.
 * <p>
 * Time Complexity: O(1) – the method performs a constant number of comparisons
 * regardless of the input value.
 * </p>
 */
public class GradeEvaluator {

    /**
     * Returns the grade message corresponding to the given percentage.
     *
     * @param percentage the student's percentage (expected to be between 0 and 100 inclusive)
     * @return a String representing the grade: "first", "second", "third", or "needs improvement"
     * @throws IllegalArgumentException if the percentage is negative or greater than 100
     */
    public static String getGradeMessage(double percentage) {
        // Validate input range – keeping the logic clean and predictable
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100, got: " + percentage);
        }

        // Evaluate grade using simple, mutually exclusive conditions (O(1))
        if (percentage >= 60) {
            return "first";
        } else if (percentage >= 45) {   // automatically < 60 because of the previous condition
            return "second";
        } else if (percentage >= 33) {   // automatically < 45
            return "third";
        } else {
            return "needs improvement";
        }
    }

    /**
     * Prints the grade message for a given percentage to the standard output.
     * This is a convenience method that uses {@link #getGradeMessage(double)}.
     *
     * @param percentage the student's percentage
     */
    public static void printGrade(double percentage) {
        System.out.println(getGradeMessage(percentage));
    }

    /**
     * Example usage (can be removed or kept for testing).
     */
    public static void main(String[] args) {
        // Test the method with a few values
        printGrade(75);    // first
        printGrade(55);    // second
        printGrade(40);    // third
        printGrade(20);    // needs improvement
        // printGrade(-5); // would throw exception
    }
}