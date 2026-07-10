// Practice program: swaps end characters and sorts letters in a word.
import java.util.*;
public class Swap_Sort
{
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    
    Swap_Sort()
    {
        wrd="";
        len=0;
        swapwrd="";
        sortwrd="";
    }
    
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word ");
        wrd=sc.next().toUpperCase();
        len=wrd.length();
    }
    
    void swapchar()
    {
        if(len==1)
            swapwrd= wrd;
        else 
            // Move the last character to the front and the first to the end.
            swapwrd= wrd.charAt(len-1)+wrd.substring(1,len-1)+wrd.charAt(0);
    }
      
    void sortword()
    {
        char arr[]=wrd.toCharArray();
        char temp;
        for (int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        sortwrd= new String(arr);
     }
    
     void display()
     {
       System.out.println("swapword="+swapwrd);
       System.out.println("sortword="+sortwrd);
     }

      public static void main (String args[])
      {
       Swap_Sort ob=new Swap_Sort();
       ob.readword();
       ob.sortword();
       ob.swapchar();
       ob.display();
     }
}
