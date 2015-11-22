package fundamentals;

/**
 * Created by leo on 11/22/15.
 */

import java.util.Arrays;

public class EX_1_1_29 {

    public static int rank(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = (lo + hi) / 2;

        while(lo<=hi) {

            if(key==a[mid]) {
                while (--mid >= 0 && a[mid] == key);
                return mid+1;
            } else if(key>a[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
            mid = (lo + hi) / 2;
        }
        return 0;
    }

    public static int count(int[] a, int key)
    {
        int c = 0;
        for (int i = rank(a, key); i < a.length && a[i] == key; i++)
            c++;
        return c;
    }

    public static void traverse(int[] a, int start, int length) {
        for(int i=start;i<start+length;i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 3, 5, 5, 6, 5, 8, 1, 1, 2, 3, 5, 6, 6};

        Arrays.sort(a);

        int key = 5;
        int i = rank(a, key);
        int j = count(a, key);

        traverse(a, 0, a.length);

        System.out.printf("%d %d\n", i, j);

        traverse(a, i, j);
    }
}
