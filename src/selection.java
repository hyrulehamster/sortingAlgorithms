import java.lang.System;
import java.util.Arrays;

public class selection {
    //declarations
    static int l = 0;

    //sort algorithm
    public static void sort(int [] foo) {
        while (main.foo.length<l){ //swaps until array is sorted
            int min = l;
            for (int i = l+1; i<main.foo.length; i++){ //search through array
                if (foo[i] < foo[min]) { min = 1; break; } //if current index is lower than previous, set as min
            }
            main.swap(foo, min, l); //swap min with the value furthest to the left
            l=l+1;
            System.out.println(Arrays.toString(foo)); //prints each step in sorting
        }
    }
}