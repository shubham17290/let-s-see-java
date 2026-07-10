import java.util.Scanner;

/**
 * Practice program: Sorts letters using a Frequency Array (Counting Sort).
 * Time Complexity: O(N) - Linear Time!
 */
public class FastWordSorter {
    
    private String word;
    private String sortedWord;

    public void readWord(Scanner sc) {
        System.out.print("Enter The Word: ");
        this.word = sc.next().toUpperCase();
    }
    
    public void sort() {
        // Create an array of 26 buckets for the alphabet
        int[] letterCounts = new int[26];
        
        // 1. Count the letters (Runs in O(N) time)
        for (int i = 0; i < word.length(); i++) {
            letterCounts[word.charAt(i) - 'A']++; 
        }
        
        // 2. Rebuild the string using a StringBuilder 
        // (StringBuilder is much faster and more memory-efficient than String concatenation)
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            while (letterCounts[i] > 0) {
                builder.append((char) (i + 'A'));
                letterCounts[i]--;
            }
        }
        
        // Save the rebuilt string back to the state
        this.sortedWord = builder.toString();
    }
    
    public void display() {
        System.out.println("\n--- O(N) Fast Results ---");
        System.out.println("Original word : " + word);
        System.out.println("Sorted word   : " + sortedWord);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            FastWordSorter obj = new FastWordSorter();
            obj.readWord(sc);
            obj.sort();
            obj.display();
        }
    }
}