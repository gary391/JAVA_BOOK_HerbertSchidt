package thisReferenceInJava;

public class Pwr {
    // Data members
    double b;
    int e;
    double val;

    // Constructor along with validations
    Pwr(double base, int exp){
        b= base;
        e= exp;

        val = 1;
        if(exp==0) return; // The initialization with condition if the exp is zero the value will be 1 - return; cause
        // immediate termination

        for(; exp>0;exp--){ // Here we have moved the initialization outside of the for loop
            val = val * base;

        }
        System.out.println("Exit!");
    }
    // Method
    double getVal(){
        return val;
    }
}
class DemoPwr{
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the "+x.e+" power is "+x.getVal());
//        System.out.println(y.b + " raised to the "+y.e+" power is "+y.getVal());
//        System.out.println(z.b + " raised to the "+z.e+" power is "+z.getVal());
    }
}