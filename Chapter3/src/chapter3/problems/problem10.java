package chapter3.problems;

import java.io.IOException;

// Convert lowercase letter to uppercase letter
// Convert lower case to upper case
// Convert upper case to lower case
// stop when you end period
// display the count
public class problem10 {
    public static void main(String[] args) throws IOException {
        // initiate the variable
        char ch;
        int counter = 0;
        char result;
        char ignore;

        // Using do while loop to request user input
        do {
            System.out.println("Please enter a character: ");
            ch = (char)System.in.read();

            // Discard any other character in the input buffer
            do {
                ignore = (char) System.in.read();
                } while(ignore != '\n');
                if (ch>='a' & ch <='z'){
                    result = (char)(ch - 32);
                    counter++;
                    System.out.println("Capitalized Letter is :"+ result);
                } else if (ch>='A' & ch <='Z'){
                    result = (char)(ch + 32);
                    counter++;
                    System.out.println("LowerCase Letter is :"+ result);
                }
            }while(ch != '.');
        System.out.println("Exiting the program, see you tomorrow");
        System.out.println("Your Conversion count is "+ counter);


    }
}
