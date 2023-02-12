public class NotHandled {
    // Let JVM handle the error
    public static void main(String[] args) {
        // Array of 4 elements
        int[] nums = new int [4];
        System.out.println("Before exception is generated");

        // generate an index out-of-bound exception
        // Here we are assigning an element at index 7 a value of 10;
        // which will create an out-of-bound exception
        nums[7] = 10;
    }
}
