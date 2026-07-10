// Practice program: suggests a stream based on marks.
import java.util.*;
class school
{
    void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter total marks");
        int marks=ob.nextInt();
        if (marks>=300)
        System.out.println("science");
        else if(marks>=200 &&  marks<300)
        System.out.println("commerce");
        else if (marks<200 && marks >=75)
        System.out.println("arts");
        else
        System.out.println("less marks");
    }
}

    
