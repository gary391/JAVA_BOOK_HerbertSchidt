package chapter3.loops;
// Write a program with for loop that stop when the user inputs a specific value
public class ForLoopControl {
    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("Press S to Stop!");
        for (i = 0; (char) System.in.read() != 100; i++) {
            System.out.println("Press # : " + i);
        }
    }
}