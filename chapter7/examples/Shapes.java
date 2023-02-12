package examples;

// Simple class hiearchy

// A class for two-dimensional objects

class TwoDShapes{

    // Attributes
    double width;
    double height;

    // Method
    void showDim(){
        System.out.println("Width and height are " + width + " and  "+ height);
    }
}

// A subclass of TwoDShape for triangles
class Triangle extends TwoDShapes {

    // Attributes
    String style;


    // Here we can directly refer to the attributes from the parent class width and height
    double area(){
        return width * height / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShapes{
    boolean isSquare(){
        if(width == height) {
            return true;
        } else {
            return false;
        }
    }
    double area(){
        return width * height;  
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.height = 10;
        t1.width = 20;
        t1.style = "filled";

        t2.height = 25;
        t2.width = 5;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        TwoDShapes shapes = new TwoDShapes();
        shapes.height = 100;
        shapes.width = 20;
        shapes.showDim();
    }
}