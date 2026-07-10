// Practice program: merges two numbers using arithmetic place values.
import java.util.*;
public class Merger1
{
    // data members or instance variables 
    
    long n1 , n2 , mergNum;
    
    //constructor to initialise data member
    public Merger1()
    {
        // initialise instance variables
        n1 =n2=mergNum=0;
    }
    //to accept value
    void readNum()
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter no.");
    n1 = ob.nextLong();
    n2 = ob.nextLong();
    }
    
    void JoinNum()
    {
         int s=1 ; long a=n2;
         while(a!=0)
         {
             a=a/10;
             s=s*10;
            }
            mergNum=(n1*s)+n2;
    }
    
    void show()
    {
        System.out.println("First number = "+n1);
        System.out.println("Second number ="+n2);
        System.out.println("mergNum number = "+mergNum);
    }
     public static void main(String args[])
     {
         Merger1 obj=new Merger1();
         obj.readNum();
         obj.JoinNum();
         obj.show();
    }
}
