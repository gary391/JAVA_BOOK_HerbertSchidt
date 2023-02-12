public class ExcTypeMismatch {
    public static void main(String[] args) {
        int [] nums = new int[4];
        try {
            System.out.println("Before exception is generated.");
            nums[7] = 10; // Exception will occur here so the line next will not be executed
            System.out.println("this won't be displayed");
            /* Can't catch an array boundary error with an ArithmeticException
            * */
        } catch (ArithmeticException exc){
            // catch the exception
            System.out.println("Index-out-of-bounds!");

        }
        System.out.println("After the catch statement.");
    }
}
