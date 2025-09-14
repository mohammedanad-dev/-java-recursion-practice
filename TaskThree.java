public class TaskThree {


    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        int max = findMaxRecursive(numbers,0);

        System.out.println("Finding the maximum number with a recursion...");

        /* --- START OF BLOCK TO REPLACE ---
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
         --- END OF BLOCK TO REPLACE --- */

        System.out.println("The maximum number is: " + max);
    }

    public static int findMaxRecursive(int[] nums, int index){
        if (index == nums.length - 1 ){
            return nums[index];
        }
        if ( nums[index] > findMaxRecursive(nums,index+1) ){
        return nums[index] ;
    }
        return  findMaxRecursive(nums,index+1);
    }

}