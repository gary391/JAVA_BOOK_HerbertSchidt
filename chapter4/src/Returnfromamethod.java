public class Returnfromamethod {
    void myMeth(){ // return type is void
        int i;

        for(i=0;i<10;i++){
            if(i==5) return; // will cause the immediate termination of a method
            System.out.println(i);
        }
    }

    /**
     *
     * void myMth(){
     *     //
     *     if(done) return;
     *     //
     *     if(error) return;
     *     //
     * }
     */
    public static void main(String[] args) {
        Returnfromamethod test =new Returnfromamethod();
        test.myMeth();
    }
}
