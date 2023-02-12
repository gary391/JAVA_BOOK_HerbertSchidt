package arrarys;

public class ForEachLoopUntil {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // Use for each style for to display and sum the values
        for (int x : nums) { // Here x represents the actual value in the array starting form the index 0
//            sum = sum + x;
            sum += x;

            if (x == 5) {
                break;
            }
        }
        System.out.println("The sum of elements in array nums is: " + sum);

    }
}
