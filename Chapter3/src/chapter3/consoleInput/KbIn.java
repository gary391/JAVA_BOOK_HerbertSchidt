package chapter3.consoleInput;

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        System.out.print("Press a key followed by Enter:  ");
        ch = (char) System.in.read();// reading a single character from the input and type casting it to a char
        System.out.println(ch);

    }
}
