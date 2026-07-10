// Practice program: swaps two input numbers using a temporary variable.
import java.util.Scanner;
class transfer
{
   public static void main (String args[])
    {
    Scanner sc=new Scanner(System.in);
    
        System.out.println("INPUT A");
        int a=sc.nextInt();
    System.out.println("INPUT B");
    int b=sc.nextInt();
    int temp=a;
    a=b;
    b=temp;
     System.out.println("a="+a);
      System.out.println("b="+b);
    }
    
    
    
    
    
    
    
    
}
    
