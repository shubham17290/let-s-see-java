// Practice program: reads a number and prints its factorial recursively.
import java.util.*;
class testrecursion

{
    int factorial(int n)
    {
        if (n==0)
        return 1;
        else
        return(n*factorial(n-1));
    }
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no to find factorial");
        int number =ob.nextInt();
        testrecursion obj=new testrecursion();
        int fact = 1;
        fact=obj.factorial(number);
        System.out.println(" factorial  of "+ number+"="+fact);

    }
        
    
}
