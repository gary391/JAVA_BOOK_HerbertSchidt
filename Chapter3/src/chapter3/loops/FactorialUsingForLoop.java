package chapter3.loops;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        int fact =1;
        int sum = 0;

        for(int i=1; i<=5; i++){
            sum = sum + i;
            fact = fact *i;
    }
        System.out.println("The Factorial is : "+ fact);
        System.out.println("The sum is : "+ sum);
    }


}
