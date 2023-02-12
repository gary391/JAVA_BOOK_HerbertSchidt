package chapter3.problems;

public class Problem7 {
    public static void main(String[] args) {
        int y =5;
        int x = 6;
        for (int i =0; i <10;i++){
            while(x>0){
                if(x>y)break;
            }
            System.out.println("After while");
        }
        System.out.println("After for ");
    }
}
