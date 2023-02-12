package arrarys;
// For each loop

/*
for (type itr-var: collection) statment-or-block
* */
public class ForEachLoop {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        // Use for each style for to display and sum the values
        for (int x: nums){
//            sum = sum + x;
            sum +=x;
        }
        System.out.println("The sum of elements in array nums is: " + sum);

        // Find the sum of first 5 elements of the array
    }
}
