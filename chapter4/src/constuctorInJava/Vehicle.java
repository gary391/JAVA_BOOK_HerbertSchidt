package constuctorInJava;
// Adding a constructor
public class Vehicle {
    // Data members

    int passengers;
    int fuelCap;
    int mpg;

    // This is a constructor for vehicle.
    Vehicle(int passengers, int fuelCap, int mpg){
        this.passengers =passengers;
        this.fuelCap=fuelCap;
        this.mpg=mpg;
    }

    // Method
    int range(){
        return mpg* fuelCap;
    }
    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

}
class VehConsDemo{
    public static void main(String[] args) {
        // Construct complete Vehicles
        Vehicle minivan = new Vehicle(7, 22, 16);
        Vehicle sportscar = new Vehicle(2, 16, 25);
        double gallons;
        int dist=390;
        gallons = minivan.fuelNeeded(390); // As we are calling the function on object minivan, it automatically
                                                // takes the values of mpg
        System.out.println("For travelling "+dist+" miles minivan needs "+gallons+ " gallons of fuel");
        gallons = sportscar.fuelNeeded(390);
        System.out.println("For travelling "+dist+" miles sportscar needs "+gallons+ " gallons of fuel");

    }
}