package examples.MemberAccessAndInheritance;

// A class for two-dimensional objects

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
class Triangle extends examples.MemberAccessAndInheritance.TwoDShapes {

    // Attributes
   private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    // Here we can directly refer to the attributes from the parent class width and height
    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends examples.MemberAccessAndInheritance.TwoDShapes {
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
        examples.MemberAccessAndInheritance.Triangle t1 = new examples.MemberAccessAndInheritance.Triangle();
        examples.MemberAccessAndInheritance.Triangle t2 = new examples.MemberAccessAndInheritance.Triangle();

        System.out.println("Using Getter and Setter!!!");

        t1.setHeight(10);
        t1.setWidth(20);
        t1.setStyle("filled");

        t2.setHeight(25);
        t2.setWidth(5);
        t2.setStyle("outlined");

        System.out.println("Info for t1: ");

        t1.showStyle();
        t1.showDim();
        System.out.println("Style via getter: " + t1.getStyle());
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Style via getter: " + t2.getStyle());
        System.out.println("Area is " + t2.area());

        examples.MemberAccessAndInheritance.TwoDShapes shapes = new examples.MemberAccessAndInheritance.TwoDShapes();
        shapes.setHeight(100);
        shapes.setWidth(20);
        shapes.showDim();
    }
}