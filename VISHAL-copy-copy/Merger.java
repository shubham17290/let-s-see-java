// Practice program: merges two numbers by string concatenation.
import java.util.*;
public class Merger
{
    // data members or instance variables 
    
    long n1 , n2 , mergNum;
    
    //constructor to initialise data member
    public Merger()
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
        String a=Long.toString(n1);
        String b=Long.toString(n2);
        String c=a+b;
        mergNum=Long.valueOf(c);
    }
    
    void show()
    {
        System.out.println("First number = "+n1);
        System.out.println("Second number ="+n2);
        System.out.println("mergNum number = "+mergNum);
    }
     public static void main(String args[])
     {
         Merger obj=new Merger();
         obj.readNum();
         obj.JoinNum();
         obj.show();
    }
}
