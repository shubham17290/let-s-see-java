public class ModernStarPattern {

    public static void print(int rows) {
        for (int i = 1; i <= rows; i++) {
            // .repeat() instantly duplicates the string 'i' times. 
            // No inner loop required!
            System.out.println("*".repeat(i)); 
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}