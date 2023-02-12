package chapter3.problems;
// 1,2,4,8,16,32 64 using for loop i.e. 2^n
public class Problem9 {
    public static void main(String[] args) {

        for(int i = 1; i <100; i=i+i){
            System.out.println(i);
        }
    }
}
