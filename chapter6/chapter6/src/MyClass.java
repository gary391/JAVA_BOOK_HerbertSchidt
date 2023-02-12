public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    // Setter
    void setAlpha(int a){
        this.alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}
class AccessDemo{
    public static void main(String[] args) {
        MyClass obj = new MyClass();// object of MyClass

        obj.setAlpha(-99);
        System.out.println("obj.alpha is " + obj.getAlpha());

        // You can not access alpha like this
//         obj.alpha = 10;
        obj.beta = 100;
        obj.gamma = 101;
    }
}