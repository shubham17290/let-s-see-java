public class FactorialRecursion {
    
    public static void main(String[] args) {
        int num = 4;
        
        // Because the method is static, we don't even need to create an object!
        int result = calculateFactorial(num);
        
        System.out.println("The factorial of " + num + " is: " + result);
    }
    
    // Proper recursion: No global variables. 
    // It multiplies 'num' by the result of the next method call.
    static int calculateFactorial(int num) {
        // Base case: if num reaches 1, stop the chain and return 1
        if (num <= 1) {
            return 1;
        }
        
        // Recursive case: multiply current number by the factorial of (number - 1)
        return num * calculateFactorial(num - 1);
    }
}