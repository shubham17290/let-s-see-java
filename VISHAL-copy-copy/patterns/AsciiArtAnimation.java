// Program: Displays animated ASCII art using a 2D character array.
// Each character is printed with a small delay to create an animation effect.

public class AsciiArtAnimation implements Runnable {

    @Override
    public void run() {

        // 2D character array containing the ASCII artwork
        char[][] asciiArt = {
            // your entire array goes here...
        };

        // Print the ASCII art row by row
        for (int row = 0; row < asciiArt.length; row++) {

            try {

                // Print each character in the current row
                for (int column = 0; column < asciiArt[row].length; column++) {

                    // Small delay to create an animation effect
                    Thread.sleep(10);

                    System.out.print(asciiArt[row][column]);
                }

                // Move to the next line after printing one row
                System.out.println();

            } catch (InterruptedException e) {

                // Restore the interrupted status
                Thread.currentThread().interrupt();

                System.out.println("Animation interrupted.");
            }
        }
    }

    public static void main(String[] args) {

        // Create and start a new thread to display the animation
        Thread animationThread = new Thread(new AsciiArtAnimation());

        animationThread.start();
    }
}