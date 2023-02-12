// Manually Throw an exception

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw!");
            throw new ArithmeticException(); // Throw an exception
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught: " + exc);
        }
        System.out.println("After try/catch block");
    }
}
