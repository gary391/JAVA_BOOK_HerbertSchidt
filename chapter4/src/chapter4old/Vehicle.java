// A program that uses Vehicle class
public class Vehicle {

    int passengers; // number of passenger
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Display the range method - NO RETURN
//    void range(){
//        System.out.println("Range is "+ fuelcap * mpg);
//    }

    // Constructor

    Vehicle(int passengers, int fuelcap, int mpg){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute the fuel needed for a given distance
    double fuelNeeded(int miles){
        return (double) miles/mpg; // Here miles is type casted as type double
    }
}

// This class declares an object of type Vehicle.
// If we use public key word with the class we will have to define the class in a separate file.
//class VehicleDemo{
//    public static void main(String[] args) {
//        Vehicle minivan = new Vehicle();
//        int range; // This is required as we are using a variable range below of type int.
//
//        // Assigning values to fields in minivan
//        minivan.passengers = 5;
//        minivan.fuelcap = 25;
//        minivan.mpg = 10;
//
//        // Computing the range assuming the full tank of gas
//        range = minivan.fuelcap * minivan.mpg;
//        System.out.println("Minivan can carry "+ minivan.passengers + " with a range of "+range);
//    }
//}

// Class declares two vehicles
//class TwoVehicles{
//    public static void main(String[] args) {
//        // Create instances of a class
//        Vehicle minivan = new Vehicle();
//        Vehicle sportscar = new Vehicle();
//
//        int rangem, ranges;
//
//        //Assigning values to fields in objects
//        minivan.passengers = 5;
//        minivan.fuelcap = 25;
//        minivan.mpg = 10;
//
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 15;
//        sportscar.mpg = 22;
//
//
//
//        //Computing the range assuming the gas tank is full.
//        rangem = minivan.fuelcap * minivan.mpg;
//        ranges = sportscar.fuelcap * sportscar.mpg;
//
//
//        System.out.println("The minivan can carry "+minivan.passengers+" with a range of "+ rangem);
//        System.out.println("The sportscar can carry "+sportscar.passengers+" with a range of "+ ranges);

        // Reference variable and assignment

//        Vehicle car1 = new Vehicle();
//        Vehicle car2 = car1;
//
//        car1.mpg = 26;
//        System.out.println(car1.mpg);
//        System.out.println(car2.mpg); // Here car2 also refer to car1
//
//
//        Vehicle car3 = new Vehicle();
//        car2 = car3;
//        System.out.println(car2.mpg);


//    }
//}

// Adding Method
//class AddMeth{
//    public static void main(String[] args) {
//
//        // instance of a vehicle class
//        Vehicle minivan = new Vehicle();
//        Vehicle sportscar = new Vehicle();
//
//        int range1, range2;
//
//        // Assigning values to fields in minivan
//        minivan.passengers = 5;
//        minivan.fuelcap =25;
//        minivan.mpg = 10;
//
//        // Assigning values to fields in sportscar
//        sportscar.passengers =2;
//        sportscar.fuelcap =16;
//        sportscar.mpg =22;
//
//        // print the result
//        System.out.println("Minivan can carry "+ minivan.passengers + ". ");
//        minivan.range();
//        System.out.println("Sportscar can carry "+ sportscar.passengers + ". ");
//        sportscar.range();
//    }
//}
//class RetMeth{
//    // instantiate a class
//    public static void main(String[] args) {
//        int range1, range2;
//        Vehicle minivan = new Vehicle();
//        Vehicle sportscar = new Vehicle();
//
//        // initialization of values
//        minivan.passengers = 5;
//        minivan.fuelcap = 25;
//        minivan.mpg=10;
//
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 16;
//        sportscar.mpg = 22;
//
//        // get the range
//        range1 = minivan.range();
//        range2 = sportscar.range();
//        System.out.println("The minivan can carry "+minivan.passengers+" with a range of "+ range1);
//        System.out.println("The sportscar can carry "+sportscar.passengers+" with a range of "+ range2);
//
//    }
//
//}
class Compfuel{
    public static void main(String[] args) {
        // instantiation and initialization
        Vehicle minivan = new Vehicle(5, 25, 10);
        Vehicle sportscar = new Vehicle(2, 16, 22);
        double gas;
        int dist = 300;

        // initialization of values
//        minivan.passengers = 5;
//        minivan.fuelcap = 25;
//        minivan.mpg=10;
//
//        sportscar.passengers = 2;
//        sportscar.fuelcap = 16;
//        sportscar.mpg = 22;


        gas = minivan.fuelNeeded(dist);
        System.out.println("To go "+ dist + " miles the minivan will need "+ gas);
        gas = sportscar.fuelNeeded(dist);
        System.out.println("To go "+ dist + " miles the sportscar will need "+ gas);
    }
}


