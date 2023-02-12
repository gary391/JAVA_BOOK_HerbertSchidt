package chapter3.consoleInput;

public class NestedSwtich {
    // throws java.io.IOException is necessary to handle input exceptions.
    public static void main(String[] args) throws java.io.IOException{

        char ch1;
        char ch2;

        System.out.println("Press a key followed by Enter: ");
        ch1  = (char) System.in.read(); // get a char
        ch2  = (char) System.in.read(); // get a char
        switch(ch1){
            case 'A':
                System.out.println("This A is part of the outer switch");
                switch (ch2){
                    case 'A':
                        System.out.println("This A is part of the inner switch statement");
                        break;
                    case'B':
                        System.out.println("This B is part of the inner switch statement");
                }
                break;
            case 'B':
                System.out.println("This B is part of the outer switch");
                break;
                }
        System.out.println("All done!!");


    }
}
