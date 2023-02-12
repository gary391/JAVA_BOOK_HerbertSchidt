package arrarys;
// Find the minimum and maximum values of the array

public class MinMax {
    public static void main(String[] args) {
        // Empty array of length 10
        /*
        int [] nums = new int [10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -1978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        */

        int [] nums = { 99, -10, 200123, 18, -1978, 5623, 463, -9, 287, 49};
        int min, max;

        // Initially assigning a min and maximum value which is an element at array index 0.

        min = max = nums[0];
        for (int i=1; i < 10; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
