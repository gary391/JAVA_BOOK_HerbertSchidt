package chapter3.consoleInput;
// Write a guessing game using if and else clause which accept a single character K as answer.
public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.println("Can you guess it: ");
        ch = (char) System.in.read();// user input
        if (ch== answer){
            System.out.println("You guessed it right");
        }else{
            System.out.println("Better luck next time!");
        }

    }
}
