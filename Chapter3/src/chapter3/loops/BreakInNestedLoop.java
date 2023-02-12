package chapter3.loops;

public class BreakInNestedLoop {
    public static void main(String[] args) {
        for(int i =0; i< 3; i++){
            System.out.println("Outer Loop Count :" + i );
            System.out.print("    Inter loop count: ");
            int t = 0;
            while(t < 100){
                if (t == 10) break; // This condition will be true when the value of t is 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
            System.out.println("This is outside the inner while loop!!");

        }
        System.out.print("Loop completed!!");
    }
}
