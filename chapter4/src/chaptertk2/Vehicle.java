package chaptertk2;

class Vehicle {
    // data members or instance variables

    int passengers;
    int fuelcap;
    int mpg;
}
//class VehicleDemo{
//    public static void main(String[] args) {
//
//        // Create an instance of class vehicle
//        Vehicle minivan = new Vehicle();
//        int range;
//
//        //Assign values to field in minivan
//        // Using dot notation
//        minivan.passengers = 7;
//        minivan.fuelcap = 18;
//        minivan.mpg = 22;
//
//        System.out.println(minivan.passengers);
//        System.out.println(minivan.fuelcap);
//        System.out.println(minivan.mpg);
//
//        // computer the range assuming a full tank of gas
//        range = minivan.fuelcap*minivan.mpg;
//        System.out.println("Range of minivan is :" + range + " miles");
//    }
//}
class TwoVehicles{
    public static void main(String[] args) {
        int range1, range2;
        //Create two instances of a class Vehicle
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        // Assign values to the field in minivan and sportscar
        minivan.passengers = 7;
        minivan.fuelcap = 18;
        minivan.mpg = 22;

        sportscar.passengers =2;
        sportscar.fuelcap =15;
        sportscar.mpg =10;

        range1 = minivan.fuelcap*minivan.mpg;
        range2 = sportscar.fuelcap*sportscar.mpg;

        System.out.println("Minivan Range is "+ range1);
        System.out.println("Sportscar Range is "+ range2);

//        Vehicle car2 = new Vehicle();
        Vehicle car1 = new Vehicle();
        Vehicle car3 = new Vehicle();
        Vehicle car2 = car1; // car1 and car2 both refer to the same memory location of the object.
        car1.mpg =26;
        car2 = car3;
        System.out.println("Car3 : "+car3.mpg);
        System.out.println("Car1 :"+car1.mpg);
        System.out.println("Car2: "+car2.mpg);

    }
}
