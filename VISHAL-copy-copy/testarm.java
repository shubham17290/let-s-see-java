// Practice program: checks whether an input number is an Armstrong number.
import java.util.*;

class testarm 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        // Armstrong check: add the cube of every digit.
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
