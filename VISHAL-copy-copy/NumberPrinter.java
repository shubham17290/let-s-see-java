public class NumberPrinter {
    
    // The main method is required to run the code!
    public static void main(String[] args) {
        
        int num = 1;
        
        System.out.println("Printing numbers from 1 to 100:");
        
        while (num <= 100) {
            // Use print() instead of println() to keep them on the same line
            System.out.print(num + " ");
            num++;
        }
        
        // This adds a final newline so your terminal prompt doesn't look messy after it finishes
        System.out.println(); 
    }
}