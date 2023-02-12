package chapter3.consoleInput;

public class SwitchDemoNoBreak {
    public static void main(String[] args) {
        int i;
        for (i=0;i<8;i++){
            switch (i){
                case 0:
                    System.out.println("i is 0");
                case 1:
                    System.out.println("i is 1");

                case 2:
                    System.out.println("i is 2");

                case 3:
                    System.out.println("i is 3");

                case 4:
                    System.out.println("i is 4");
                case 5: // Stacking of case  - For case of 5, 6, & 7 statement at case 7 is executed.
                case 6: // Stacking of case
                case 7: // Stacking of case
                    System.out.println("i is less 7 ");
                    break;

            }
            System.out.println();

        }

    }
}
