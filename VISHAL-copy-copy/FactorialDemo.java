
// Practice program: calculates factorial using recursion.
import java.util.Scanner;
class FactorialDemo
{
   public static void main(String args[])
   {
      //Scanner object for capturing the user input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      //Stored the entered value in variable
      int num = scanner.nextInt();
      if (num < 0) {
         System.out.println("Factorial is not defined for negative numbers.");
         return;
      }
      //Called the user defined function fact
      int factorial = fact(num);
      System.out.println("Factorial of entered number is: "+factorial);
   }
   static int fact(int n)
   {
       
       if(n==0 || n==1)
       {
         return 1;
       }
       else
       {
       //Recursion: Function calling itself!!
          return fact(n-1)* n;
       }
       
   }
}
