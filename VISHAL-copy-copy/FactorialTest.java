public class FactorialTest {
    
    // display() is an instance method, so it can talk to factorial() directly!
    public void display() {
        int num = 5;
        
        // No 'new' needed here! Just call the method directly.
        long fact = factorial(num); 
        
        System.out.println("The factorial of " + num + " is " + fact);
    }
    
    // I upgraded this to 'long' just in case you test numbers larger than 12!
    public long factorial(int x) {
        if (x == 0 || x == 1) { 
            return 1;
        }
        return x * factorial(x - 1);
    }

    // The main method is where the program actually starts
    public static void main(String[] args) {
        
        // We create the object exactly ONCE here
        FactorialTest app = new FactorialTest();
        
        // Tell the object to run its display method
        app.display(); 
    }
}