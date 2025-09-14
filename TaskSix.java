public class TaskSix {

        public static void main(String[] args) {
            int count = 10;

            System.out.println("Generating the first " + count + " Fibonacci numbers iteratively...");

            /*--- START OF BLOCK TO REPLACE ---
            // This entire block calculates and prints the sequence.
            // Your goal is to call a recursive function inside a simple loop instead.
            int n1 = 0, n2 = 1;
            System.out.print(n1 + " " + n2);

            for (int i = 2; i < count; i++) {
                int n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
             --- END OF BLOCK TO REPLACE ---*/
            System.out.println();
            for (int i = 0; i < count; i++)
                System.out.print(fibonacciRecursive(i) + " ");
        }

    public static int fibonacciRecursive(int n){
            if (n <= 1) return n;
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
        // The main method will then be changed to:
        // for (int i = 0; i < count; i++) {
        //     System.out.print(fibonacciRecursive(i) + " ");
        // }
    }

