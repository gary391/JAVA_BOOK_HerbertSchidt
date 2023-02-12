package examples.CallSuperClassConstructor;

class TwoDShapes{

    // Attributes
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // default constructor
    TwoDShapes() {
        width = height = 0.0;
    }

    // Constructor with equal width and height

    TwoDShapes (double x){
        width = height =x;
    }
    // Parameterized Constructor
    TwoDShapes(double w, double h){
        width = w;
        height = h;
    }

    // Method
    void showDim(){
        System.out.println("Width and height are " + width + " and  "+ height);
    }
}

// A subclass of TwoDShape for triangles
class Triangle extends examples.CallSuperClassConstructor.TwoDShapes {

    // Attributes
    private String style;
//    String style;

    // Constructor
    Triangle (){
        super();
        style = "none";
    }
    Triangle(String s, double w, double h){

        // Use Super() to call the Super class constructor
        super(w, h);

        style = s; // This is attribute in the Triangle class
    }

    Triangle(double x){
        super(x); // Calls the super class constructor which has a single value.
        style = "Solid";
    }
    // Here we can directly refer to the attributes from the parent class width and height
    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends examples.CallSuperClassConstructor.TwoDShapes {

    boolean isSquare(){
        if(getWidth() == getHeight()) {
            return true;
        } else {
            return false;
        }
    }
    double area(){
        return getWidth() * getHeight();
    }
}


public class Shapes {
    public static void main(String[] args) {
        examples.CallSuperClassConstructor.Triangle t1 = new examples.CallSuperClassConstructor.Triangle();
        examples.CallSuperClassConstructor.Triangle t2 = new examples.CallSuperClassConstructor.Triangle("Outlined", 22, 22);
        Triangle t3 = new Triangle(50);

//        t1.style= "Big"; // Here we are assigning a string to Style attribute of Triangle. If this made private we will not be able to access it directly

        System.out.println("==================================");
        System.out.println("Info for t1: ");

        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println("==================================");

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();

        System.out.println("Area is " + t2.area());
        System.out.println("==================================");
        System.out.println("Info for t3: ");
        System.out.println("t3 height: " + t3.getHeight());
        System.out.println("t3 width: "+ t3.getWidth());
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is : " + t3.area());
        System.out.println("==================================");
        System.out.println("TwoDShapes!!");
        examples.CallSuperClassConstructor.TwoDShapes shapes = new examples.CallSuperClassConstructor.TwoDShapes(50, 50);

        shapes.showDim();
        System.out.println("==================================");
        System.out.println("Rectangle!!!!!");
        System.out.println();
        Rectangle r1 = new Rectangle();
        r1.setHeight(20);
        r1.setWidth(20);
        System.out.println("Is this is a square? " + r1.isSquare());
        System.out.println(r1.area());
    }
}
