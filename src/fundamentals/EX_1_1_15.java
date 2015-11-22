package fundamentals;

/**
 * 1.1.15 Write a static method histogram() that takes an array a[]
 * of int values and an integer M as arguments and returns an array of
 * length M whose ith entry is the num- ber of times the integer i
 * appeared in the argument array. If the values in a[] are all between
 * 0 and M–1, the sum of the values in the returned array should be
 * equal to a.length.
 * Created by leo on 11/21/15.
 */

import java.util.Arrays;

public class EX_1_1_15 {
    public static int[] histogram(int[] a, int M) {
        Arrays.sort(a);

        int[] arr = new int[M];

        for(int i=0;i<a.length;i++) {
            arr[a[i]] ++;
        }

        return arr;
    }
}
