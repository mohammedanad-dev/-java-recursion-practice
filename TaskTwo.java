public class TaskTwo {

    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseStringRecursive(original);

        System.out.println("Reversing string using a recursion ...");

        /* --- START OF BLOCK TO REPLACE ---
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
         --- END OF BLOCK TO REPLACE ---*/

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

   public static String reverseStringRecursive(String str) {
       if (str.length() <= 1) {
           return str;
       }
       return str.charAt(str.length() - 1) + reverseStringRecursive(str.substring(0, str.length() - 1));

   }
}