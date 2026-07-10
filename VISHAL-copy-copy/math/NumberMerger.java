import java.util.Scanner;

public class NumberMerger {
    
    // Data members (Private for good OOP encapsulation)
    private long n1, n2, mergedNum;

    // Passing the scanner as a parameter prevents memory leaks
    public void readNum(Scanner sc) {
        System.out.print("Enter first number: ");
        n1 = sc.nextLong();
        
        System.out.print("Enter second number: ");
        n2 = sc.nextLong();
    }
    
    public void joinNum() {
        // String.valueOf() is the safest and cleanest way to convert
        String combinedStr = String.valueOf(n1) + String.valueOf(n2);
        
        // parseLong is better than valueOf because it returns a primitive long
        mergedNum = Long.parseLong(combinedStr);
    }
    
    public void show() {
        System.out.println("\n--- Results ---");
        System.out.println("First number  = " + n1);
        System.out.println("Second number = " + n2);
        System.out.println("Merged number = " + mergedNum);
    }
    
    public static void main(String[] args) {
        // try-with-resources automatically closes the Scanner!
        try (Scanner sc = new Scanner(System.in)) {
            NumberMerger obj = new NumberMerger();
            
            obj.readNum(sc);
            obj.joinNum();
            obj.show();
        }
    }
}