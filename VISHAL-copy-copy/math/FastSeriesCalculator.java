public class FastSeriesCalculator {

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        
        double sum = 0.0;
        
        // The very first term when i=2 is (x^2 / 1!)
        double currentTerm = (x * x) / 1.0; 
        
        for (int i = 2; i <= n; i += 2) {
            // Add the current term to the sum
            sum += currentTerm;
            
            // Calculate the NEXT term using the math multiplier trick!
            // This completely eliminates the need for Math.pow() and Factorial loops!
            double multiplier = (double) (x * x) / (i * (i + 1));
            currentTerm *= multiplier;
        }
        
        System.out.println("Sum of the series (Optimized): " + sum);
    }
}