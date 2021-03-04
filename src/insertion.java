import java.lang.System;
import java.util.Arrays;

public class insertion {
    //declarations

    //swap method, takes arr and swaps i with j
    public static void swap(int [] arr, int i, int j) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

    //sort algorithm
    public static void sort(int [] foo) {
        for(int i = 0; i<foo.length; i++){
            int  j=i;
            while (j>0 && foo[j-1]>foo[j]){
                swap(foo, j, j-1);
                j = j -1;
                System.out.println(Arrays.toString(foo));
            }
        }
    }
}