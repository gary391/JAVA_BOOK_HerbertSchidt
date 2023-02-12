package chapter3.loops;
// Using a Break to exit the loop and using continue to keep going
public class Break {
    public static void main(String[] args) {
        int num;
        num = 100;
        // Loop while i squared is less than num
        for (int i = 0;i <100;i++){
            if(i*i >= num)
            break;
            System.out.print(i+ " ");
        }
        System.out.print("Loop completed!!"); // This statement is executed when the value of i is 10
    }
}
