package examples;

// Demonstrate when constructors are executed
/*
Constructing A
Constructing B
Constructing C
 */
// Create a super class
class A {
    A() {
        System.out.println("Constructing A");
    }
}
// Create a subclass that extends the super class A
class B extends A {
    B() {
        System.out.println("Constructing B");
    }
}
class C extends B {
    C(){
        System.out.println("Constructing C");
    }
}

public class WhenAreConstructorExecuted {
    public static void main(String[] args) {
        C c = new C();

    }

}
