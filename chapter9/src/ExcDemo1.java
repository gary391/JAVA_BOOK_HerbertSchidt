public class ExcDemo1 {
    // Demonstrate exception handling
    public static void main(String[] args) {
        // creates an array of 4 items
        int [] nums = new int[4];
        try {
            System.out.println("Before exception is generated");
            // Generate an index out-of-bound exception
            nums[4] = 10;
            System.out.println("This won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc){
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
