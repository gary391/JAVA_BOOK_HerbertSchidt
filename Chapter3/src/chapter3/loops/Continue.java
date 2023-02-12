package chapter3.loops;
// Using continue to print even numbers from 1 to 100
public class Continue {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i<=100;i++){
            if(i%2 != 0 )continue; // Iterate
            System.out.println(i);
            }
        }
    }

