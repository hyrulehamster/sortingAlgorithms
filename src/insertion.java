import java.lang.System;
import java.util.Arrays;

public class insertion {
    //declarations

    //sort algorithm
    public static void sort(int [] foo) {
        for(int i = 0; i<foo.length; i++){
            int rmbrNum = foo[i];
            int  j=i;
            while (j>0 && foo[j-1]>rmbrNum){
                main.swap(foo, j, j-1);
                j = j -1;
                System.out.println(Arrays.toString(foo));
            }
            foo[j] = rmbrNum;
        }
    }
}