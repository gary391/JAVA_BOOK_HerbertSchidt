package chapter3.loops;
// Show square root of 1 to 99 and the rounding error
/*
Calculate Square root using math.sqrt
Rounding error = num - (sqrt *sqrt )

 */
public class SqrRoot {
    public static void main(String[] args) {
    // variable type declaration
        double num, sroot, rerr;

        for(num = 1.0; num <100; num++){
//            System.out.println(num);
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is "+ sroot);

        // Computing rounding error
        rerr = num - (sroot * sroot);
            System.out.println("Rounding error is "+ rerr);
            System.out.println("");
        }
    }
}
