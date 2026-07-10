public class MathHelper {
    
    // Clear name, and we skip the middleman variable!
    public int multiply(int m, int n) {
        return m * n;
    }
    
    // Clear name for displaying the result
    public void display() {
        System.out.println("5 * 3 = " + multiply(5, 3));
    }

    // We need the main method to actually trigger the code
    public static void main(String[] args) {
        MathHelper helper = new MathHelper();
        helper.display();
    }
}