package arrarys;
// Demonstrate a one-dimensional array
public class ArrayDemo {
    public static void main(String[] args) {

        // empty array of length 10
        int []  sample = new int[10];

        // Assign values to the array

        for (int i=0; i <10; i++){
            sample[i]= i;
        }
        // Print each element of the array
        for(int i = 0; i< 10; i++){
            System.out.println("The value of array indexed at "+ i +" is "+ sample[i]);
        }
    }
}
