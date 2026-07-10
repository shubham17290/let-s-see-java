/**
 * Practice program: Implements a basic integer stack using an array.
 * LIFO: Last-In, First-Out.
 */
public class IntegerStack {
    
    // ENCAPSULATION: We make these 'private' so no other class can 
    // accidentally change the 'top' variable and break our stack!
    private int[] st;
    private int size;
    private int top;

    // Constructor to initialize the stack
    public IntegerStack(int n) {
        size = n;
        st = new int[size];
        top = -1; // -1 means the stack is completely empty
    }

    public void push(int n) {
        if (top == size - 1) {
            System.out.println("OVERFLOW: The stack is completely full!");
        } else {
            top++; // Move the pointer up
            st[top] = n; // Insert the data
            System.out.println("Pushed: " + n);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("UNDERFLOW: The stack is empty!");
            // This is a temporary fix for the -999 problem. 
            // We use the smallest possible integer to represent an error.
            return Integer.MIN_VALUE; 
        } else {
            int val = st[top]; // Grab the top value
            top--; // Move the pointer down
            return val;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("\n--- Stack Elements (Top to Bottom) ---");
            for (int i = top; i >= 0; i--) {
                System.out.println("|  " + st[i] + "  |");
            }
            System.out.println("-------");
        }
    }

    // Main method to test our Data Structure!
    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack(3);
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        myStack.display();
        
        // Let's test the OVERFLOW
        myStack.push(40); 
        
        System.out.println("\nPopped element: " + myStack.pop());
        
        myStack.display();
    }
}