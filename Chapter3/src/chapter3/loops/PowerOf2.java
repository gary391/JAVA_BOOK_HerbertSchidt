package chapter3.loops;

import java.io.IOException;

// Compute the integer of 2 using for and while loops togather
// 2^1 = 2
// 2^2 = 4
// 2^3 = 8
public class PowerOf2 {
    public static void main(String[] args) throws IOException {
        int e;
        int result;
        // using for loop you can generate the numbers
        for (int i = 1; i<10; i++){
            result = 1; // initialize the value of the result
            e = i; // Assigning or initializing the value of e
            while (e>0){
                result = result *2;
                e--;
            }
            System.out.println("2 to the "+ i +" power is " + result);
        }


        }
    }

