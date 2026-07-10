import java.util.*;

/**
 * Reads a sentence terminated by '.', '?' or '!', computes the "potential"
 * of each word, and prints the words sorted by their potential in ascending order.
 * <p>
 * Word potential is defined as the sum of the alphabetical positions of its
 * letters (A=1, B=2, ..., Z=26). Non-letter characters are ignored during the
 * calculation, ensuring a robust potential value.
 * </p>
 * <p>
 * Time Complexity Analysis:
 * <ul>
 *   <li>Potential computation: O(L) per word, where L is the word length.</li>
 *   <li>Sorting: O(n log n) using {@link Arrays#sort(Object[], Comparator)} after
 *       creating a list of word objects. The original code used Bubble Sort
 *       (O(n²)); this is improved to a much more efficient algorithm.</li>
 *   <li>Overall: O(N + n log n) where N is total characters in the sentence.</li>
 * </ul>
 * </p>
 */
public class WordPotentialSorter {

    /**
     * A simple immutable data holder for a word and its computed potential.
     */
    private static class WordPotential {
        final String word;
        final int potential;

        WordPotential(String word, int potential) {
            this.word = word;
            this.potential = potential;
        }
    }

    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ENTER THE SENTENCE:");
            String input = scanner.nextLine().trim();

            // Validate that the sentence ends with a proper terminator
            if (input.isEmpty() || !isTerminator(input.charAt(input.length() - 1))) {
                System.out.println("INVALID INPUT");
                return;
            }

            // Remove the termination punctuation
            String content = input.substring(0, input.length() - 1).trim();
            if (content.isEmpty()) {
                // No words to process – gracefully handle empty content
                System.out.println("No words to process.");
                return;
            }

            // Split the content into words (handles multiple spaces)
            String[] words = content.split("\\s+");

            // Compute potential for each word and store in an array of WordPotential
            WordPotential[] wordPotentials = new WordPotential[words.length];
            for (int i = 0; i < words.length; i++) {
                int pot = computePotential(words[i]);
                wordPotentials[i] = new WordPotential(words[i], pot);
            }

            // Display the calculated potentials
            System.out.println("Potential:");
            for (WordPotential wp : wordPotentials) {
                System.out.println(wp.word + " = " + wp.potential);
            }

            // Sort the WordPotential objects by their potential (ascending)
            // Using a stable sort with O(n log n) complexity
            Arrays.sort(wordPotentials, Comparator.comparingInt(wp -> wp.potential));

            // Output the sorted words as a sentence
            System.out.println("Sorted Sentence:");
            for (int i = 0; i < wordPotentials.length; i++) {
                System.out.print(wordPotentials[i].word);
                if (i != wordPotentials.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // final newline
        }
    }

    /**
     * Computes the potential of a word by summing the alphabetical positions
     * (A=1, B=2, ..., Z=26). Non-alphabetic characters are ignored.
     *
     * @param word the input word
     * @return the integer potential value
     */
    private static int computePotential(String word) {
        int potential = 0;
        // Process the word in uppercase to simplify ASCII arithmetic
        for (char ch : word.toUpperCase().toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                potential += ch - 'A' + 1;  // 'A' - 'A' + 1 = 1, ..., 'Z' - 'A' + 1 = 26
            }
            // Non-letter characters are silently ignored (robustness)
        }
        return potential;
    }

    /**
     * Checks whether a character is one of the allowed sentence terminators.
     *
     * @param ch the character to test
     * @return true if ch is '.', '?' or '!'
     */
    private static boolean isTerminator(char ch) {
        return ch == '.' || ch == '?' || ch == '!';
    }
}