package chapter3.loops;

public class ForLoopCases {
    public static void main(String[] args) {
        int i;
        for (i=0; i<10;){
            System.out.println("Printing the value of i : "+ i);
            i++;

        }
        // Moving the initialization outside of the for loop
        // and the incrementation
//        i =0;
//        for (; i<10;){
//            System.out.println("Press # "+ i);
//            i++;// Increment loop control var
//        }
    }
}
