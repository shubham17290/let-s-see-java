// Practice program: creates a bordered and diagonal character matrix.
import java.util.*;
public class finalpractical
{
      public static void main (String args[])
     {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Size");
           int n=sc.nextInt();
           if(n<1||n>10)
           {
            System.out.println("Size out of Range");
            return;
           }
        
           System.out.print("First Character : ");
           char ch1=sc.next().charAt(0);
           System.out.print("Second Character : ");
           char ch2=sc.next().charAt(0);
           System.out.print("Third Character : ");
           char ch3=sc.next().charAt(0);

            char m[][]=new char[n][n];

            for(int i=0;i<n;i++)
            { 
                for(int j=0;j<n;j++)
                {
                   if(i==j||(i+j)==n-1)
                    {
                    m[i][j]=ch3;
                   }
                   
                   else if(i==0||i==n-1)
                   {
                    m[i][j]=ch1;
                   }
                    
                   else if(j==0||j==n-1||i%2==0)
                   {
                    m[i][j]=ch2;
                   }
                   
                   else
                   { 
                       m[i][j]=ch1;
                    }
                }
            }
                    
            System.out.println("OUTPUT :");
              
          for(int i=0;i<n;i++)
                  { 
                      for(int j=0;j<n;j++)
                       {
                       System.out.print(m[i][j] +"\t");
                       }
                      System.out.println();
                   }

                }
            }  
            
