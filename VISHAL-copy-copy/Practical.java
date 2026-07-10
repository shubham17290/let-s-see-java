// Practice program: builds a character matrix from three input characters.
/* 
 /*
   Algorithm-
 
1.	Start
2.	Input the size of the matrix 'n' using Scanner class
3.	Check if 'n' is less than 1 or greater than 10. If true, print "Size out of Range" and return
4.	Input the first, second and third characters using Scanner class
5.	Initialize a 2-dimensional character array with size 'n x n'
6.	Use nested for loop to iterate through the array
7.	Check the following conditions for each element of the array:
     o	If the element is located on the diagonal or the anti-diagonal, assign the third character to it
     o	If the element is located on the first or last row, assign the first character to it
     o	If the element is located on the first or last column, or the row number is even, assign the second character to it
     o	Else, assign the first character to it
8.	Print the matrix using another nested for loop
9.	End 

 */ 
import java.util.Scanner;

public class Practical
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
       
        if (n < 1 || n > 10) {
            System.out.println("Size out of Range");
            return;
        }
       
        System.out.print("First Character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Second Character: ");
        char ch2 = sc.next().charAt(0);
        System.out.print("Third Character: ");
        char ch3 = sc.next().charAt(0);
       
        char m[][] = new char[n][n];
        char x = ch2;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i == j || (i + j) == n - 1) 
                {
                    m[i][j] = ch3;
                }
                else if (i == 0 || i == n - 1) 
                {
                    m[i][j] = ch1;
                }
                else if (j == 0 || j == n - 1 || i % 2 == 0) 
                {
                    m[i][j] = ch2;
                }
                else 
                {
                    m[i][j] = ch1;
                }
            }
        }
       
        System.out.println("OUTPUT:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/* Given a square matrix M[][] of order 'n'. The maximum value possible for 'n' is 10. Accept three
different characters from the keyboard and fill the array according to the output shown in the
examples. If the value of n exceeds 10 then an appropriate message should be displayed.
Example 1
Enter Size: 4
Input:
First Character '*'
Second Character '?'
Third Character '#'
Output:
# * * #
? # # ?
? # # ?
# * * #








*/
