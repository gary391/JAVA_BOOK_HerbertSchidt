package take2;
// Use a nested try block

public class NestTrys {
    public static void main(String[] args) {
        // Here numerator is greater than the denominator
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};
        try { // outer try
            for (int i = 0; i < numer.length; i++) { // Runs tile the second last entry of the loop i.e. 256, which is caught in an exception
                System.out.println(" numerator of " +  i +" "+  numer[i]);
                // For less severe error
                try { // nested try
                    System.out.println(numer[i] + " / "
                            + denom[i] + " is " + numer[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Can't divide by zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of Bound Error!");
        }
    }
}
