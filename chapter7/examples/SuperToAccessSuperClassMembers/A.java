package examples.SuperToAccessSuperClassMembers;

public class A {

    // Attribute
    int i;

}

// Create a subclass by extending class A.

class B extends A {
    int i; // This i will hide the attribute i in class A

    // Constructor
    B(int a, int b ){
        super.i = a; // i in A
        i = b; // i in B
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: "+ i);
    }
}
class  UseSuper{
    public static void main(String[] args) {
        B objb = new B(1, 3); // Here we are setting the value of the superclass attribute and subclass attribute
        objb.show();
    }
}