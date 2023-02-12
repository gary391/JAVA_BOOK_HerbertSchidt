package chapter3.help;

import java.io.IOException;

public class Help2 {
    public static void main(String[] args) throws IOException {

        char choice, ignore;
        // Menu
        do {
            System.out.println("Help on: ");
            System.out.println("\t1: if");
            System.out.println("\t2: switch");
            System.out.println(("\t3: for"));
            System.out.println(("\t4: while"));
            System.out.println(("\t5: do while"));
            System.out.println("Choose one:");

            choice = (char) System.in.read();
            // This is to ignore the carriage return and line feed
            do {
            ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while (choice < '1'| choice > '5'); // The Above will execute again and again until the choice is between 1 and 5

        // Using switch to get the results
        switch(choice){
            case '1':
                System.out.println("If & Else logic");
                break;
            case '2':
                System.out.println("Switch logic");
                break;
            case'3':
                System.out.println("for loop logic");
                break;
            case '4':
                System.out.println("while loop logic");
                break;
            case '5':
                System.out.println("do while loop logic");
                break;
            default:
                System.out.println("Selection not found!!");
        }

    }
}
