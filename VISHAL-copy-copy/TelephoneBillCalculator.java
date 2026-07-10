import java.util.Scanner;

public class TelephoneBillCalculator {

    // 1. PURE BUSINESS LOGIC: This method ONLY does math. 
    // It doesn't know about Scanners or printing.
    public double calculateTotal(int calls) {
        if (calls < 0) {
            System.err.println("Error: Number of calls cannot be negative.");
            return 0.0;
        } 
        
        if (calls <= 100) {
            return 500.0;
        } else if (calls <= 200) {
            return 500.0 + ((calls - 100) * 1.10);
        } else if (calls <= 300) {
            return 500.0 + (100 * 1.10) + ((calls - 200) * 1.25);
        } else {
            return 500.0 + (100 * 1.10) + (100 * 1.25) + ((calls - 300) * 1.35);
        }
    }

    // 2. I/O LOGIC: The main method handles the user interaction safely.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of phone calls: ");
            int calls = sc.nextInt();

            TelephoneBillCalculator calculator = new TelephoneBillCalculator();
            
            // We pass the data in, and get the final money out
            double finalBill = calculator.calculateTotal(calls);

            System.out.println("\n--- Bill Summary ---");
            System.out.println("Number of Calls : " + calls);
            System.out.println("Total Bill      : ₹" + finalBill);
        }
    }
}