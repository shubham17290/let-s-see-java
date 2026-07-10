// Practice program: reads and prints a 2x3 integer matrix.
import java.util.*;
class twoD
{
 public static void main( String srgs[])
 {
     Scanner sc=new Scanner(System.in);
     
     int a[][]=new int[2][3];
     System.out.println("enter arrays");
     for(int i=0;i<2;i++)
     {
       for(int j=0;j<3;j++)
       {
         a[i][j]=sc.nextInt(); 
       }
      }

      // Display the 2D array after all elements are read.
      for(int i=0;i<2;i++)
      {
       for(int j=0;j<3;j++)
       {
         System.out.print(a[i][j]+" ");
       }
       System.out.println();
     }
}
}
