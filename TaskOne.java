import java.util.Arrays;
import java.util.List;

    public class TaskOne {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
            int totalSum = calculateSumRecursive(numbers,0);

            System.out.println("Calculating sum using a Recursive...");

            /*--- START OF BLOCK TO REPLACE ---
            for (int i = 0; i < numbers.size(); i++) {
                totalSum += numbers.get(i);
                System.out.println("Current sum: " + totalSum);
            }
             --- END OF BLOCK TO REPLACE ---*/

            System.out.println("--------------------------");
            System.out.println("The final sum is: " + totalSum);
        }

        public static int calculateSumRecursive(List<Integer> nums, int index){
            if (index == nums.size()){
                return 0;
            }

            int currentSum=nums.get(index)+ calculateSumRecursive( nums,index + 1 );
            System.out.println("Current sum "+ index+" : " + currentSum);
            return currentSum;




        }
    }

