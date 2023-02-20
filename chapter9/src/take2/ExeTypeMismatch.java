package take2;

public class ExeTypeMismatch {
    public static void main(String[] args) {
        int [] nums = new int[4];

        try {
            System.out.println("Before exception is generated!!");

            //Generate an index out-of-bounds exception
            nums[7] = 10;
            System.out.println("This won't be displayed");
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Index-out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
