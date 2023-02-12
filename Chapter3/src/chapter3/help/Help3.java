package chapter3.help;

import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {

        char choice, ignore;
        // Menu
        for(;;){
            do {
                System.out.println("Help on: ");
                System.out.println("\t1: if");
                System.out.println("\t2: switch");
                System.out.println(("\t3: for"));
                System.out.println(("\t4: while"));
                System.out.println(("\t5: do while"));
                System.out.println("\t6: break");
                System.out.println("\t7: continue \n");

                System.out.println("Choose one (q for quit):");

                choice = (char) System.in.read();
                // This is to ignore the carriage return and line feed
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while (choice < '1'| choice > '7' & choice != 'q'); // The Above will execute again and again until the choice is between 1 and 5
                if(choice == 'q')break;

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
                case '6':
                    System.out.println("Break");
                    break;
                case '7':
                    System.out.println("continue");
                    break;
            }
            System.out.println();
        }
        System.out.println("Thanks for trying out the game !!!");
    }
}
