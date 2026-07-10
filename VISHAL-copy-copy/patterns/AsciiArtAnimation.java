// Program: Displays animated ASCII art using a 2D character array.

public class AsciiArtAnimation implements Runnable {

    @Override
    public void run() {

        // Simple ASCII Art
        char[][] asciiArt = {
            "  *     *  ".toCharArray(),
            " ***   *** ".toCharArray(),
            "***** *****".toCharArray(),
            " ********* ".toCharArray(),
            "  *******  ".toCharArray(),
            "   *****   ".toCharArray(),
            "    ***    ".toCharArray(),
            "     *     ".toCharArray()
        };

        // Print the ASCII art row by row
        for (int row = 0; row < asciiArt.length; row++) {

            try {
                for (int column = 0; column < asciiArt[row].length; column++) {
                    Thread.sleep(10);      // Animation delay
                    System.out.print(asciiArt[row][column]);
                }
                System.out.println();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Animation interrupted.");
                return;
            }
        }
    }

    public static void main(String[] args) {

        Thread animationThread = new Thread(new AsciiArtAnimation());
        animationThread.start();
    }
}