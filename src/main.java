import java.util.Arrays;

public abstract class main {
    static int[] foo = new int[5];  //arr foo is declared

    //main
    public static void main(String[] args) {
        fillfoo();
        System.out.println(Arrays.toString(foo));   //prints foo before it gets sorted
        insertion.sort(foo);
        System.out.println(Arrays.toString(foo));   //prints foo after it was sorted
    }


    //for testing
    public static void fillfoo(){
        for(int i=0; i<foo.length; i++){
            foo[i] = (int) (Math.random()*10); //foo gets filled with random numbers from 0-10
        }
    }
}
