package chapter3.consoleInput;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i=0;i<6;i++)
            switch (i){
                case 0:
                    System.out.println("i is 0");
                    break;
                case 1:
                    System.out.println("i is 1");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                case 4:
                    System.out.println("i is 4");
                    break;
                default:
                    System.out.println("i is 5 or more ");
            }
    }
}
