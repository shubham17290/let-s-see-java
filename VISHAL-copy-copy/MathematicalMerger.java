import java.util.Scanner;

public class MathematicalMerger {
    
    private long n1, n2, mergedNum;

    // Passing the scanner inside prevents memory leaks
    public void readNum(Scanner sc) {
        System.out.print("Enter first number: ");
        n1 = sc.nextLong();
        
        System.out.print("Enter second number: ");
        n2 = sc.nextLong();
    }
    
    public void joinNum() {
        long multiplier = 1;
        long temp = n2;
        
        // A do-while loop forces it to multiply by 10 at least once.
        // This completely fixes the bug if the user types '0' for n2!
        do {
            multiplier *= 10;
            temp /= 10;
        } while (temp != 0);
        
        mergedNum = (n1 * multiplier) + n2;
    }
    
    public void show() {
        System.out.println("\n--- Results ---");
        System.out.println("First number  = " + n1);
        System.out.println("Second number = " + n2);
        System.out.println("Merged number = " + mergedNum);
    }
    
    public static void main(String[] args) {
        // Automatically closes the scanner safely
        try (Scanner sc = new Scanner(System.in)) {
            MathematicalMerger obj = new MathematicalMerger();
            obj.readNum(sc);
            obj.joinNum();
            obj.show();
        }
    }
}