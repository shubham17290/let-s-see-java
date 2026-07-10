// Practice program: reads a number and shows simple arithmetic output.
import java.io.*;
class hum
{
 static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter no");
       String num=br.readLine();
        int m=Integer.parseInt(num);
       
         System.out.println(m);
         double a=Math.pow(m,2);
         
         System.out.println(a);
    }
}
