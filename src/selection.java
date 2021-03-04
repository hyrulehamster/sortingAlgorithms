import java.lang.Math;
import java.lang.System;
import java.util.Arrays;

public class selection {
    //declarations
    static int n = main.foo.length;

    //swap method, takes arr and swaps i with j
    public static void swap(int [] arr, int i, int j) {
        arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    }

    //sort algorithm
    public static void sort(int [] foo) {
        while (n>1){
            for (int i=0; i<n-1; i++) {
                if (foo[i] > foo[i + 1]) {  //compares i and  i+1, bigger one is swapped
                    swap(foo, i, i + 1);
                    System.out.println(Arrays.toString(foo)); //prints each step in sorting
                }
            }
            n=n-1; //stops if the if condition above can't sort any more numbers, i.e. if all numbers are sorted
        }
    }
}