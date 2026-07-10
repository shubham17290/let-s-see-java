// Practice program: checks whether a number is a duck number.
import java.util.*;
public class duck_number
{
    
    public static void main(String args[])
      {
        
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter number to check duck number");
      String num=sc.nextLine();
      int c=0 , n;
       for( n=0;n<num.length();n++)
      {
          if (num.charAt(n)=='0')
         c++;
        }
      if(c>0 && num.charAt(0)!='0')
      System.out.println("It is duck number");
      else
      System.out.println("It is not duck number");
    
      }
    }

    

