// Practice program: checks whether a number equals the sum of digit factorials.
import java.util.*;
class Special1
{
    int n;
    Special1()
    {
        n=0;
    }
    
    void read()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the no. = " );
        n =ob.nextInt();
    }
    
    int factorial(int x)
    {
        if(x==0)
        return 1;
        else
        return x*factorial(x-1);
    }
    
    boolean IsSpecial()
    {
        int num =n , sum =0;
        while(num>0)
        {
            int t=num%10;
            int f=factorial(t);
            // Special number check: sum of factorials of digits.
            sum =sum+f;
            num=num/10;
        }
        if (n==sum)
        return true;
        else
        return false ;
    }
    
    void display()
    {
        
    Boolean res=IsSpecial ();
    if(res==true)
    System.out.println("specialno. ");
    else 
    System.out.println("not special");
   }    

    public static void main (String args[])
    {
        Special1 sp=new Special1();
        sp.read();
        sp.display();
    }
}
            
        
        
        
        
        
        
    
    
            
    
