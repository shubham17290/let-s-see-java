// Practice program: prints number names for values from 1 to 5.
import java.util.*;
class repeate
{
    void print()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Number");
        int num = ob.nextInt();
        if (num==1)
        System.out.println("one");
        else if (num==2)
        System.out.println("two");
        else if (num==3)
        System.out.println("three");
        else if (num==4)
        System.out.println("four");
        else if (num==5)
        System.out.println("five");
        else
        System.out.println("Out of range");
    }
}
        
