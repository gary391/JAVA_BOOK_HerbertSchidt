package examples.ConstrutorAndInheritance;

// A class for two-dimensional objects
// Here we don't have a constructor of the super class
// so the constructor of the subclass is only executed



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

    // Method
    void showDim(){
        System.out.println("Width and height are " + width + " and  "+ height);
    }
}

// A subclass of TwoDShape for triangles
class Triangle extends examples.ConstrutorAndInheritance.TwoDShapes {

    // Attributes
    private String style;
//    String style;

    // Constructor
    Triangle(String s, double w, double h){

        // Initialized TwoDShape portion of the object
        setHeight(h);
        setWidth(w);

        style = s; // This is attribute in the Triangle class
    }

    // Here we can directly refer to the attributes from the parent class width and height
    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends examples.ConstrutorAndInheritance.TwoDShapes {
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
        examples.ConstrutorAndInheritance.Triangle t1 = new examples.ConstrutorAndInheritance.Triangle("Filled", 11, 22);
        examples.ConstrutorAndInheritance.Triangle t2 = new examples.ConstrutorAndInheritance.Triangle("Outlined", 22,22);

//        t1.style= "Big"; // Here we are assigning a string to Style attribute of Triangle. If this made private we will not be able to access it directly



        System.out.println("Info for t1: ");

        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();

        System.out.println("Area is " + t2.area());

        examples.ConstrutorAndInheritance.TwoDShapes shapes = new examples.ConstrutorAndInheritance.TwoDShapes();
        shapes.setHeight(100);
        shapes.setWidth(20);
        shapes.showDim();
    }
}
