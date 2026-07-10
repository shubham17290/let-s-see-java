public class SumCalculator {
    
    // Passing 'limit' makes this method reusable!
    public void printSums(int limit) {
        
        int evenSum = 0;
        int oddSum = 0;
        
        // Added curly braces for safety and readability
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                evenSum += i; // '+=' is the pro way to write evenSum = evenSum + i
            } else {
                oddSum += i;
            }
        }
        
        System.out.println("Sum of even numbers up to " + limit + " = " + evenSum);
        System.out.println("Sum of odd numbers up to " + limit + "  = " + oddSum);
    }
    
    // We need a main method to actually run the program
    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();
        calc.printSums(50);
    }
}