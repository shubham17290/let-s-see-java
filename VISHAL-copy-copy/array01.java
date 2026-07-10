// Practice program: reads array elements from the user and prints them.
import java.util.Scanner;

class array01

{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size:- ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("array size = " + marks.length);
        System.out.println("enter " + n + " elements");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("elements are");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

}
