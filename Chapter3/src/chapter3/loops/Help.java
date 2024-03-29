package chapter3.loops;
    public class Help {
        public static void main(String[] args) throws  java.io.IOException{

            // Start Menu
            System.out.println("Help on:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("Choose one: ");

            // User selection
            char choice = (char) System.in.read();

            // Switch statement to act on the choice received from the user
            switch(choice) {
                case '1':
                    System.out.println("The if: \n");
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement \n");
                    break;
                case '2':
                    System.out.println("The traditional switch: \n");
                    System.out.println("switch (expression) {");
                    System.out.println("  Case constant:");
                    System.out.println("    statement sequence");
                    System.out.println("    break;");
                    System.out.println("   // ....");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Selection not found.");
            }
        }
}
