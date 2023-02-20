package take2;
/*
Simple Execption Example
 */
public class ExcDemo1 {
    public static void main(String[] args) {
        int [] nums = new int [4];
        try {
            System.out.println("Before exception is generated!");
            // Generate an index out of bound execption
//            nums[7] = 10;
            nums[0] = 10;
            System.out.println("This won't be displayed in case of an exception");
        } catch (ArrayIndexOutOfBoundsException exc) {
            //catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After the catch statement!");
    }

}
