import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Practice program: Prints animated ASCII art to the console.
 */
public class Love implements Runnable {

    // Extracted delay for easy tweaking
    private static final int DELAY_MS = 10;

    // The identical ASCII art from your first program, translated into clean Strings!
    private static final String[] ASCII_ART = {
        ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::",
        ":::::::'.::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::",
        "::::'  .:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::",
        ":: .::, :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::",
        ":::::::. ::::::::::::::::::::::@@@@@@@@@@@:::::::::::@@@@@@@@@@@:::::::::::",
        "::::::::. :::' ::::@@@@@ .     @@@@@:::::@@@@@   .   @@@@@:::::::::::::::::",
        ":::::::::, '.:::::::@@@.       .     @@@::@@@   .       .  @@@:::::::::::::",
        "::::::::::::::::@@@. @. @.   . @. @. @.   . @. @. @.   . @. @. @.@@@:::::::",
        ":::::::::::::::::@@@.@.@.@.  . @.@.@.@.   . @.@.@.@.   . @.@.@.@.@@@:::::::",
        ":::::::::::::::::@@@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@.@@@:::::",
        ":::::::::::::::::@@@.@.@.:.@.@.:.@@@@.:.@.@@@@.@.@.:.@.@.:.@.@@@:::::::::::",
        "::::::::::::::::::@@@.:.@@@.:.@@@@  ....@.....@@.:.@@@.:.@@@@@@::::::::::::",
        ":::::::::::::::::::@@@.@.:.@.:.@@      .........@@.:.@.:.@.@@@:::::::::::::",
        "::::::::::::::::::::@@@.:.@@@.:.@@      .......@@.:.@@@.:.@@@@@@:::::::::::",
        "::::::::::::::::::::::@@@@.:.@.:.@.:.@.:.@@.. ..@@.:.@.:.@.:.@.@@@@::::::::",
        ":::::::::::::::::::::::::@@@@:::.:.:.:.::@@::..::.:.:.::@@@@:::::::::::::::",
        "::::::::::::::::::::::::::::@@@@|.:|.:|.:|@@@@::::::::::::::: :::::.:::::::",
        ":::::::::::::::::::::::::::::::@@@@|:|:|:|@@@@::::::::::::::::: :::::.:::::",
        "::::::::::::::::::::::::::::::::::@@@!|!@@@::::::::::::::::::: ::::: ::::::",
        "::::::::::::::::::::::::::::::::::::@@!!@@::::::::::::::::::::' `:::: :::::",
        "::::::::::::::::::::::::::::::::::::::@@::::::::::::::::::: :. :.`:::: :::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::. `:::: :.:::: :  :::::::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::.: `  .:::: .:: .  ::::::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::::: ::::: .:::: : :::::::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::::: :::::. `'':::::::::::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::::: :::::::::::::::::::::::",
        "::::::::::::::::::::::::::::::::::::::::::::::::::  :::::::::::::::::::::::",
        ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
    };

    @Override
    public void run() {
        try {
            for (String row : ASCII_ART) {
                for (char c : row.toCharArray()) {
                    System.out.print(c);
                    System.out.flush(); // Crucial for smooth terminal animation
                    
                    // Skip the delay for empty spaces to make the animation snap
                    if (c != ' ' && c != '\n') {
                        Thread.sleep(DELAY_MS);
                    }
                }
                System.out.println();
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println("\nAnimation thread was interrupted.");
        }
    }

    public static void main(String[] args) {
        // Professional thread management instead of raw Thread initialization
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        executor.submit(new Love());
        executor.shutdown();
        
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}