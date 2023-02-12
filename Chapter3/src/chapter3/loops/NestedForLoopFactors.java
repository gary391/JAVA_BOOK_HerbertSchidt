package chapter3.loops;
// Nested for loop to find the factor for numbers between 1 and 100
// Defination of factor: 2 is a factor a number if it can divide it completely
public class NestedForLoopFactors {
    public static void main(String[] args) {
        int num;
        // Outer loop to iterate over 1 to 100 numbers
        for (int i=2;i<=100; i++){
            System.out.print("Factor of : " + i + ":");

            // For each number in the outer loop check for factor
            for (int j= 2;j<i;j++){
                if(i%j ==0){
                    System.out.print(j + " ");

                }

            }
            System.out.println();
        }


    }
}
