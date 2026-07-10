// Practice program: menu for BUZZ number and GCD calculations.
import java.util.*;

public class Number

{

public static int gcd (int a, int b) {

int num, den, GCD = 0, r ;

if (a > b) {

num = a ;

den = b ;

}

else {

num = b ;

den = a ;

}

while(den > 1)

{ r = num % den ;

if(r == 0) {

GCD = den ;

break ;

}

else {

num = den ;

den = r ;

}

}

if (den == 1)

GCD = 1 ;

return GCD ;

}

public static boolean BUZZ ( int a ){

if ( a % 7 ==0 || a % 10 == 7) return true ;

else return false ;

}

public static void main(String[ ] args ) {

Scanner kb = new Scanner( System.in );

System.out.println("Menu");

System.out.println("1. BUZZ number");

System.out.println("2. GCD of two numbers");

System.out.println("Enter your choice ");

int ch = kb.nextInt();

if ( ch ==1 ){

System.out.println("Enter a number");

int num = kb.nextInt();

if (BUZZ(num) == true)

System.out.println(num+" is a BUZZ number");

else

System.out.println(num+" is not a BUZZ number");

}

else if ( ch ==2 ){

System.out.println("Enter two numbers ");

int num1 = kb.nextInt();

int num2 = kb.nextInt();

int res = gcd(num1, num2);

System.out.println("GCD of "+num1+" and "+num2+" : "+res);

}

else

System.out.println("Wrong Choice!!");}

}
