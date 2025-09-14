public class TaskSeven {

        public static void main(String[] args) {
            String sentence = "recursion is replacing the repetition of loops";
            char target = 'r';
            int count = countCharRecursive(sentence,target,0);

            System.out.println("Counting occurrences of '" + target + "' with a loop...");

            /* --- START OF BLOCK TO REPLACE ---
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == target) {
                    count++;
                }
            }
             --- END OF BLOCK TO REPLACE ---*/

            System.out.println("The character '" + target + "' appears " + count + " times.");
        }

       public static int countCharRecursive(String text, char target, int index) {
            if (text.length() == index ) return 0;

            if (text.charAt(index) == target )
                return 1 + countCharRecursive(text.substring(1),target,index);
            return countCharRecursive(text.substring(1),target,index);
       }
    }
