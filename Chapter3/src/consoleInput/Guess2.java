package consoleInput;
// Write a guessing game using if and else clause which accept a single character K as answer.
// Nested if and else clause
public class Guess2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read();// user input
        if (ch== answer){
            System.out.println("You guessed it right");
        }else{
            System.out.print("Sorry you're ");
            if(ch<answer){
                System.out.print("too low ");
            }else{
                System.out.print("too high!");
            }
        }
    }
}
