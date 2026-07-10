/**
 * Practice program: Demonstrates common String methods in Java.
 * Each output is labeled so it's easy to read in the console.
 */
public class StringTestDemo {
    
    public static void main(String[] args) {
        
        // 1. Declare our test strings with clear variable names
        String name1 = "ankit";
        String name2 = "Rahul";
        String paddedName = "  ankush  ";
        String emptyStr = "";
        String shortStr = "rah";
        
        System.out.println("--- String Manipulation ---");
        
        // .toUpperCase() converts all letters to capitals
        System.out.println("Uppercase name1     : " + name1.toUpperCase());
        
        // .toLowerCase() converts all letters to lowercase
        System.out.println("Lowercase name2     : " + name2.toLowerCase());
        
        // .concat() glues two strings together (name2 + name1)
        System.out.println("Concatenated strings: " + name2.concat(name1));
        
        // .length() returns the number of characters in the string
        System.out.println("Length of name2     : " + name2.length());
        
        
        System.out.println("\n--- Whitespace & Empty Checks ---");
        
        // .trim() removes spaces from the very beginning and very end of a string
        System.out.println("Original padded name: '" + paddedName + "'");
        System.out.println("Trimmed padded name : '" + paddedName.trim() + "'");
        
        // .isEmpty() checks if the length is exactly 0
        System.out.println("Is emptyStr empty?  : " + emptyStr.isEmpty());
        System.out.println("Is shortStr empty?  : " + shortStr.isEmpty());
        
        
        System.out.println("\n--- Searching & Comparing ---");
        
        // .charAt(index) gets the specific letter at that index (starts at 0)
        // For "Rahul", index 2 is 'h'
        System.out.println("Character at index 2 of name2 : " + name2.charAt(2));
        
        // .indexOf(char) finds the first time a letter appears and returns its index
        // For "ankit", 'i' is at index 3
        System.out.println("Index of 'i' in name1         : " + name1.indexOf('i'));
        
        // .equals() checks if two strings match exactly (case-sensitive)
        System.out.println("Does name1 exactly match name2? : " + name1.equals(name2));
        
        // .replace(old, new) swaps all instances of a character with a new one
        System.out.println("Replace 'l' with 'h' in name2   : " + name2.replace('l', 'h'));
    }
}