// Practice program: sorts letters of a word in ascending order.
import java.util.Scanner;

class sortinglearing
{
    String word;   //to store word
    int len;       //to store length of the word
    
    sortinglearing()
   {
       word="";
       len=0;
    }
    
   void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Word");
        word=sc.next().toUpperCase();
        len=word.length();
    }
    
   void sort()
   {
       char[] arr=word.toCharArray();
       for(int i=0;i<len - 1;i++)
       {
           for(int j=i + 1; j<len;j++)
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
    
     void display()
     {
        System.out.println("Original word: " + word);
     }

     public static void main(String args[])
     {
        sortinglearing obj = new sortinglearing();
        obj.readword();
        obj.display();
        // Sort the characters in ascending alphabetical order.
        obj.sort();
    }
}
        
       
