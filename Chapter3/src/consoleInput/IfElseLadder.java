package consoleInput;

public class IfElseLadder {
    public static void main(String[] args) throws java.io.IOException  {
//        int x;

        // for loop
        for (int x=0; x<6;x++){
            if(x==1){
                System.out.println(x +": x is one");
            }else if (x==2){
                System.out.println(x + ": x is two");
            }else if (x==3){
                System.out.println(x+ ": x is three");
            }else if (x==4){
                System.out.println(x+ ": x is four");
            }else{
                System.out.println(x+ ": x is not between 1 and 4");
            }
        }
    }
}
