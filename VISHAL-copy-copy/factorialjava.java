// Practice program: calculates factorial through an instance method.
import java.util.*;

class factorialjava
{
	public static void main(String args[])
	{
    		int num;//variable initialization
		Scanner sc = new Scanner(System.in);//scanner object creation
    		System.out.println("Enter a no");//println statement
    		num=sc.nextInt();//enter variable
    		factorialjava ob= new factorialjava(); //creating object
    		
    		int fact1=1;
    		fact1 = ob.fact(num) ;
   		System.out.println("FACTORIAL of ("+num+") = "+fact1);//to print factorial
   		
   	}
        
	  int fact(int n)
	{
    		if(n==0)
        		return 1;
    		else
        		return n*fact(n-1);
	}
	
}
