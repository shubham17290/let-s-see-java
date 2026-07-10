import java.util.Scanner;

public class BasicArmstrong {
    
    public static void main(String[] args) {
        
        // try-with-resources prevents Scanner memory leaks
        try (Scanner sc = new Scanner(System.in)) {
            
            // Be specific so the user knows the limitation!
            System.out.print("Enter a 3-digit number: ");
            int n = sc.nextInt();
            
            int num = n;
            int sum = 0;

            // Armstrong check: add the cube of every digit
            while (num > 0) {
                int rem = num % 10;
                sum += (rem * rem * rem); 
                num /= 10;
            }

            if (sum == n) {
                System.out.println(n + " is an Armstrong number.");
            } else {
                System.out.println(n + " is NOT an Armstrong number.");
            }
        }
    }
}