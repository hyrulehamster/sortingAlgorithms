import java.util.Arrays;

public abstract class main {
    static int[] foo = new int[5];  //random arr foo is declared
    //static int foo[] = {3, 4, 9, 1, 2}; //declare set array if needed

    //main
    public static void main(String[] args) {
        fillfoo();
        System.out.println(Arrays.toString(foo));   //prints foo before it gets sorted
        insertion.sort(foo); //can be changed to 'bubble', 'selection' or 'insertion'
    }

    //swap method, takes arr and swaps i with j
    public static void swap(int [] arr, int i, int j) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

    //fill method
    public static void fillfoo(){
        for(int i=0; i<foo.length; i++){
            foo[i] = (int) (Math.random()*10); //foo gets filled with random numbers from 0-10
        }
    }
}
