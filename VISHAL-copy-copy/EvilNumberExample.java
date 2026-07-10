// Practice program: checks whether a number has an even count of 1s in binary.
import java.util.Scanner;
class EvilNumberExample 
{
static int num = 0;
static int count = 0;
static long binaryNumber = 0;

 static boolean checkNumber(int n) 
 {
  count = 0;
  binaryNumber = convertToBinary(n);
  long currentBinary = binaryNumber;
   while(currentBinary != 0) 
   {
   if(currentBinary % 10 == 1)
    count++;
    currentBinary = currentBinary / 10;
  }
   if(count % 2 == 0)
   return true;
   return false;
   
}

static long convertToBinary(int number) 
 {
  int rem = 0;
  int j = 1;
  long result = 0;
  while(number != 0) 
  {
   rem = number % 2;
   result += rem * j;
   number = number / 2;
   j = j * 10;
  }
  return result;
 }
 
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number : ");
  num = sc.nextInt();
   if(checkNumber(num))
   {
    System.out.println("Input :"+num);
    System.out.println("Binary Equivalent:"+binaryNumber);
    System.out.println("No. of 1's :"+count);
    System.out.println("Output :Evil Number");
   }
  else
  {
    System.out.println("Input :"+num);
    System.out.println("Binary Equivalent:"+binaryNumber);
    System.out.println("No. of 1's :"+count);
    System.out.println("Output :Not an Evil Number");
  }
 }
 }
