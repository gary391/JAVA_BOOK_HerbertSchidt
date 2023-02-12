package chapter3.loops;

public class ForLoopWithNoBody {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for(i=0; i<3;sum+=i, i++);
        System.out.println("Sum is: "+ sum );

    }
}
