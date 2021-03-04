import java.lang.System;
import java.util.Arrays;

public class bubble {
    //declarations
    static int n = main.foo.length;

    //sort algorithm
    public static void sort(int [] foo) {
        while (n>1){
            for (int i=0; i<n-1; i++) {
                if (foo[i] > foo[i + 1]) {  //compares i and  i+1, bigger one is swapped
                    main.swap(foo, i, i + 1);
                    System.out.println(Arrays.toString(foo)); //prints each step in sorting
                }
            }
            n=n-1; //stops if the if condition above can't sort any more numbers, i.e. if all numbers are sorted
        }
    }
}