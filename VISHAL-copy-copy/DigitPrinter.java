public class DigitPrinter {

    public static void printDigits(int number) {
        
        // The proper way to convert an int to a String
        String rep = String.valueOf(number);
        int repLength = rep.length();

        // Check ensures we don't crash if something goes wrong
        if (repLength > 0) {
            
            // Print the first digit without a space
            System.out.print(rep.charAt(0));

            // Loop through the rest of the digits, adding a space BEFORE them
            for (int ix = 1; ix < repLength; ix++) {
                System.out.print(" " + rep.charAt(ix));
            }
        }
        
        System.out.println(); // Move to the next line when finished
    }

    public static void main(String[] args) {
        System.out.print("Separated Digits: ");
        printDigits(8675309);
    }
}