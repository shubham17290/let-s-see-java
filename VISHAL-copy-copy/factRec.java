// Practice program: calculates factorial with a recursive method.
import java.util.*;    
class factRec
{  
        int factorial(int n) //5 ! =5*4*3*2*1 =120 
     {    
      if (n == 0)       // 0!=1 so when given number is 0, it returns 1
        return 1;    
      else          // finding factorial by n * factorial(n-1)
        return(n * factorial(n-1));    
     }    
     public static void main(String args[])
     {  
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number to find the factorial");
         int number=sc.nextInt();//It is the number to calculate factorial
         factRec fr=new factRec();   //creating object fr
         int fact=1;  
         fact = fr.factorial(number);   //method invocation factorial(number)
                                        // calling recursive method
         System.out.println("Factorial of "+number+" is: "+fact);    
     }  
    }
