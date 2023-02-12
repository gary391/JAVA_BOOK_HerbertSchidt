package MethodWithParameter;

/*
Add a parameterized method that computes the fuel required for a given distance.
 */
public class Vehicle {

    // data members
    int passangers;
    int fuelcap;
    int mpg;

    // Method
    // Return a range
    int range(){
        return fuelcap *mpg;
    }

    // Compute fuel needed for a given distance
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
 class Compfuel {
     public static void main(String[] args) {

         // create objects of the class vehicle
          Vehicle minivan = new Vehicle();
          Vehicle sportscar = new Vehicle();
          double gallons;
          int dist = 390;

          // Assign values to the field in minivan
         minivan.passangers =7;
         minivan.fuelcap = 22;
         minivan.mpg = 17;

         // Assign values to the field in sportscar
         sportscar.passangers = 2;
         sportscar.fuelcap = 16;
         sportscar.mpg = 24;

         gallons = minivan.fuelNeeded(dist);
         System.out.println("For traveling "+dist+" minvan, needed gallons of gas "+gallons);
         gallons= sportscar.fuelNeeded(dist);
         System.out.println("For traveling "+dist+" sportscar, needed gallons of gas "+gallons);
     }
 }