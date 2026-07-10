/**
 * Demonstrates character increment in Java.
 * <p>
 * In Java, a {@code char} is a 16-bit unsigned integer representing a Unicode character.
 * Arithmetic operations (like {@code += 1}) automatically widen the {@code char} to {@code int},
 * perform the addition, and then implicitly cast back to {@code char} when using compound assignment.
 * </p>
 * <p>
 * Time Complexity: O(1) – all operations are constant time.
 * </p>
 */
public class CharacterIncrementDemo {

    /**
     * Prints the original character, the next character, and the second next character
     * obtained by successive increments of the initial value {@code 'a'}.
     * <p>
     * This method has no side effects beyond output.
     * </p>
     */
    public static void showCharacterSequence() {
        char ch = 'a';                              // original character
        System.out.println("Original character = " + ch);

        ch += 1;                                    // increments Unicode code point by 1
        System.out.println("Next character = " + ch);

        ch += 1;                                    // another increment
        System.out.println("Second next character = " + ch);
    }

    /**
     * Example usage. Can be used to quickly test the character increment logic.
     */
    public static void main(String[] args) {
        showCharacterSequence();
    }
}