// Practice program: swaps end characters and sorts letters in a word.
import java.util.*;

public class SwapSort {
     String wrd, swapwrd, sortwrd;
     int len;

    public SwapSort() {
        wrd = swapwrd = sortwrd = "";
        len = 0;
    }

    public void readword() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        wrd = in.next();
        len = wrd.length();
        in.close();
    }

    public void swapchar() {
        if (len <= 1) {
            swapwrd = wrd;
        } else {
            // Swap first and last characters while keeping the middle unchanged.
            swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
        }
        System.out.println("Swapped word: "+swapwrd);
    }

    public void sortword() {
        char a[] = wrd.toCharArray();
        char temp;
        boolean swapped;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (int x = 0; x < a.length - 1 - i; x++) {
                if (a[x + 1] < a[x]) {
                    temp = a[x];
                    a[x] = a[x + 1];
                    a[x + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
                break;
        }
        sortwrd = new String(a);
    }

    public void display() {
        System.out.println("Original word: " + wrd);
        System.out.println("Sorted word: " + sortwrd);
    }

    public static void main(String[] args) {

        SwapSort obj = new SwapSort();
        obj.readword();
        obj.swapchar();
        obj.sortword();
        obj.display();
    }
}
