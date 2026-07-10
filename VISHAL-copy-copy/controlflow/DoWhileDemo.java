// Program: Prints numbers from 1 to 100 using a do-while loop.

public class DoWhileDemo {

    public static void main(String[] args) {

        // Initialize the starting number
        int number = 1;

        // Execute the loop at least once
        do {

            // Print the current number
            System.out.println(number);

            // Increment the number
            number++;

        } while (number <= 100);
    }
}