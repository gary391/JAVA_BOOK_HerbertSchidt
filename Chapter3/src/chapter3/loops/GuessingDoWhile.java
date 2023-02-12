package chapter3.loops;

import java.io.IOException;

// Guess the letter game, 4th edition
public class GuessingDoWhile {
    public static void main(String[] args) throws IOException {


        char ch, ignore, answer = 'K';
        // Using do while loop
        do{
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it... ");
            // read a character
            ch = (char) System.in.read();

            //discard any other character in the input buffer - Page 86 of the book explains the reason of using
            // This do while loop
            // Pressing ENTER after the input causes a carriage return and a line feed sequence to be generated
            // The following do while loop ignores those characters. [carriage return and line feed ]
            do{
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            {
                if (ch == answer) {
                    System.out.println("You guess it Right!!");
                } else if (ch < answer) {
                    System.out.println("you guessed it low, TRY AGAIN!!");
                } else {
                    System.out.println("you guessed it high, TRY AGAIN!!!");
                }

            }
        }while (answer!=ch);
    }
}

