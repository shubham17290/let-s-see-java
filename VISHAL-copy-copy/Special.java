// Practice program: checks whether a number is a special number.
import java.util.*;
public class Special
{
    // instance variables 
    int n;

    public Special()
    {
        // initialise instance variables
         n=0;
    }
    
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to to check Special or not");
        n=sc.nextInt();
    }
    
    int factorial(int x)
    {
        if(x==0)
        return 1;
        else
        return x*factorial(x-1);
    }
    
    boolean isSpecial()
    {
         int num=n ;
         int sum=0;
         while (num>0)
         {
             int t=num%10;
             int f=factorial(t);
             sum=sum+f;
             num=num/10;
         }
         if(sum==n)
         return true;
         else 
         return false;
        }
    
    void display()
    {
      boolean res = isSpecial();
      if(res==true)
      
     System.out.println("It is Special number");
     else 
      System.out.println("It is not Special number");
    }
    public static void main(String args[])
    {
        
        Special ob= new Special();
        ob.read();
        ob.display();
    }
}
