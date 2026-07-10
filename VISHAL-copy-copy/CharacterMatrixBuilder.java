import java.util.Scanner;

/**
 * Builds and prints an n x n character matrix based on three input characters
 * and a set of filling rules.
 * <p>
 * The matrix is filled according to these priority rules:
 * <ol>
 *   <li>Cells on the main diagonal or anti-diagonal receive the third character.</li>
 *   <li>Cells in the first or last row receive the first character.</li>
 *   <li>Cells in the first or last column, or in an even-numbered row, receive the second character.</li>
 *   <li>All remaining cells receive the first character.</li>
 * </ol>
 * The order of evaluation ensures that diagonals are never overwritten by row/column rules.
 * </p>
 * <p>
 * Time Complexity: O(n²) — each cell is visited exactly twice (once during fill, once during print).
 * This is optimal because the size of the output is n².
 * </p>
 */
public class CharacterMatrixBuilder {

    /** Maximum allowed matrix size. */
    private static final int MAX_SIZE = 10;
    /** Minimum allowed matrix size. */
    private static final int MIN_SIZE = 1;

    /**
     * Entry point. Reads input, builds the matrix, and displays it.
     */
    public static void main(String[] args) {
        // try-with-resources ensures the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            // 1. Read and validate matrix size
            System.out.print("Enter size: ");
            int n = scanner.nextInt();

            if (n < MIN_SIZE || n > MAX_SIZE) {
                System.out.println("Size out of Range");
                return;
            }

            // 2. Read the three characters (only the first character of each input is used)
            System.out.print("First Character: ");
            char first = scanner.next().charAt(0);
            System.out.print("Second Character: ");
            char second = scanner.next().charAt(0);
            System.out.print("Third Character: ");
            char third = scanner.next().charAt(0);

            // 3. Build and print the matrix
            char[][] matrix = buildMatrix(n, first, second, third);
            printMatrix(matrix);
        }
    }

    /**
     * Creates an n x n matrix filled according to the specified character rules.
     *
     * @param n      size of the square matrix (1 to {@value MAX_SIZE})
     * @param first  character used for first/last row cells and default cells
     * @param second character used for first/last column cells and even row cells
     * @param third  character used for diagonal and anti-diagonal cells
     * @return the filled character matrix
     */
    private static char[][] buildMatrix(int n, char first, char second, char third) {
        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Condition 1: main diagonal or anti-diagonal -> third character
                if (row == col || (row + col) == n - 1) {
                    matrix[row][col] = third;
                }
                // Condition 2: first or last row -> first character
                else if (row == 0 || row == n - 1) {
                    matrix[row][col] = first;
                }
                // Condition 3: first/last column OR even row index -> second character
                else if (col == 0 || col == n - 1 || row % 2 == 0) {
                    matrix[row][col] = second;
                }
                // Condition 4: everything else -> first character
                else {
                    matrix[row][col] = first;
                }
            }
        }
        return matrix;
    }

    /**
     * Prints the matrix to standard output with tab-separated columns.
     * Each row appears on a new line.
     *
     * @param matrix the 2D character array to print
     */
    private static void printMatrix(char[][] matrix) {
        System.out.println("OUTPUT:");
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}