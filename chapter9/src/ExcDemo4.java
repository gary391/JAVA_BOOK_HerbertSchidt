// Use multiple catch statement
public class ExcDemo4 {
    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Catch the exception
                System.out.println("Index out of bound! - No matching element found");
            }
        }
    }
}