import org.w3c.dom.ls.LSOutput;

public class TaskTen {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println("Printing a descending star pattern with nested recursive...");
        printPatternRecursive(numRows, numRows);

            /* --- START OF BLOCK TO REPLACE ---
            for (int i = numRows; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next line
            }
             --- END OF BLOCK TO REPLACE ---*/
    }

    public static void printPatternRecursive(int rows, int cols) {
        if (rows == 0) return;
        if (cols > 0) {
            System.out.print('*');
            printPatternRecursive(rows, cols - 1);
        }
        if (cols == 0) {
            System.out.println();
            printPatternRecursive(rows - 1, rows - 1);
        }
    }
}
// Hint: Your initial call from main should be printPatternRecursive(numRows, numRows);


