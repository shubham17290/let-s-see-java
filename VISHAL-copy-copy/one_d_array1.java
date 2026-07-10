// Practice program: reads and prints a user-sized one-dimensional array.
import java.util.Scanner;
class one_d_array1
 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        
        int size = sc.nextInt();  
        
        int a[]=new int [size]; 
        
        
        
        System.out.println("enter arrays elements");
        for( int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        
        
        System.out.println("  Printed arrays are = ");
        for( int i=0;i<size;i++)

         System.out.println( a[i]);
            }
        }

        

