// Program: Calculates a telephone bill based on the number of phone calls.

import java.util.Scanner;

class TelephoneBillCalculator {

    // Method to calculate the telephone bill
    void calculateBill() {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Variable to store the final bill amount
        double totalBill;

        // Read the number of phone calls
        System.out.print("Enter the number of phone calls: ");
        int calls = sc.nextInt();

        // Calculate the bill according to the slab rates
        if (calls < 0) {

            totalBill = 0.0;

        } else if (calls <= 100) {

            totalBill = 500.0;

        } else if (calls <= 200) {

            totalBill = 500 + (calls - 100) * 1.10;

        } else if (calls <= 300) {

            totalBill = 500 + (100 * 1.10) + (calls - 200) * 1.25;

        } else {

            totalBill = 500 + (100 * 1.10) + (100 * 1.25) + (calls - 300) * 1.35;
        }

        // Display the bill
        System.out.println("\nNumber of Calls : " + calls);
        System.out.println("Total Bill      : ₹" + totalBill);

        // Close the Scanner
        sc.close();
    }

    // Main method
    public static void main(String[] args) {

        // Create an object and call the method
        TelephoneBillCalculator obj = new TelephoneBillCalculator();
        obj.calculateBill();
    }
}