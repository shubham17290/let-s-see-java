// Practice program: sorts letters of a word using nested loops.
import java.util.*;
class sortingtest 
{
    void sort()
   {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Word");
       String word=sc.next().toUpperCase();
       char arr[]=word.toCharArray();  
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1; j<arr.length;j++)
           {
               if (arr[i]>arr[j])
               {
                   char temp =arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
       System.out.println(new String(arr));

     }
    }
