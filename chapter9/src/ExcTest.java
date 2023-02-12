public class ExcTest {
    // Generate an exception
    // Static method
    static void genException(){
        int [] nums = new int[4];
        System.out.println("Before exception is generated.");
        // Generated an index out-of-bound exception
        nums[7] = 10;
        System.out.println("This won't be displayed");
    }
}

