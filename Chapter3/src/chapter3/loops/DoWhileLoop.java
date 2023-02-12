package chapter3.loops;

import java.io.IOException;

// Do While loop
/*
do-while loop checks its conditions at the bottom of the loop.
This means that the do while will be executed at least once
do {
statements;
} while (conditions);

 */
public class DoWhileLoop {
    public static void main(String[] args) throws IOException {
        char ch;
        do {
//            System.out.print("Press a key followed by ENTER: ");
            System.out.println("I'm thinking of a letter between A and Z");
            ch = (char) System.in.read();// get a char
            System.out.println("You Entered " +ch);
            }while(ch!='q');
            }
}

