package take2;

public class ExcTest {
    static void genException(){
        int [] nums = new int[4];
        System.out.println("Before exception is generated");

        // generate an index out of bound error
        nums[7] = 10;
        System.out.println("This won't be executed!");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // Catch the exception
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catching the statement");
    }
}
