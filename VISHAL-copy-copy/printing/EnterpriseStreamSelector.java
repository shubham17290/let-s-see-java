import java.util.Scanner;

public class EnterpriseStreamSelector {
    
    // CONSTANTS: If cutoffs change next year, we only change them here!
    private static final int MAX_MARKS = 500;
    private static final int SCIENCE_CUTOFF = 300;
    private static final int COMMERCE_CUTOFF = 200;
    private static final int ARTS_CUTOFF = 75;

    public String suggestStream(int marks) {
        
        // Input Validation (Guard Clauses)
        if (marks < 0 || marks > MAX_MARKS) {
            return "Error: Marks must be between 0 and " + MAX_MARKS;
        }
        
        // Clean, readable cutoff logic
        if (marks >= SCIENCE_CUTOFF) {
            return "Science Stream";
        } else if (marks >= COMMERCE_CUTOFF) {
            return "Commerce Stream";
        } else if (marks >= ARTS_CUTOFF) {
            return "Arts Stream";
        } else {
            return "Not eligible for standard streams.";
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total marks (Out of " + MAX_MARKS + "): ");
            int marks = sc.nextInt();
            
            EnterpriseStreamSelector selector = new EnterpriseStreamSelector();
            System.out.println("Result: " + selector.suggestStream(marks));
        }
    }
}