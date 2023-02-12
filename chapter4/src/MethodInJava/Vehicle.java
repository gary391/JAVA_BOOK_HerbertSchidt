package MethodInJava;

public class Vehicle {

    // Data members
    int passengers;
    int fuelcap;
    int mpg;

    // Display range
    int range(){
//        System.out.println("Range is "+fuelcap*mpg);
        return fuelcap*mpg;
    }

    void myMethfun(){
        int i;
        for (i=0;i<10;i++){
            if(i==5) return; // Termination of the method as soon as the condition is met
            System.out.println(i);
        }
    }
}
class AddMeth{
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        // Assign values to fields in minvan
        minivan.passengers = 7;
        minivan.fuelcap = 22;
        minivan.mpg = 16;
        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 25;

        System.out.println("Minivan can carry: "+minivan.passengers+". ");
       range1 = minivan.range();
        System.out.println("Range of minivan is: "+ range1);
        System.out.println("Sportscar can carry: "+sportscar.passengers+". ");
        range2 = sportscar.range();
        System.out.println("Range of sportscar is: "+ range2);

        Vehicle myMeth = new Vehicle();
        myMeth.myMethfun();

    }
}