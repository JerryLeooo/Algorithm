package fundamentals;

/**
 * Created by leo on 11/22/15.
 */

import java.util.Arrays;

public class EX_1_1_28 {

    /**
     * 不应该有第三个数组,因为不知道Java中如何使用 delete 操作
     */

    public static int[] remove_duplicates(int[] arr) {

        int N = arr.length;
        int[] rel = new int[N];

        int i = 1, j = 1;

        while(j<N) {
            if(arr[j-i]==arr[j]) {
                rel[j] = 1;
                i++;
            } else {
                i = 1;
            }
            j++;
        }

        traverse(rel);

        int[] r = new int[N];
        int counter = 0;

        for(int k=0;k<N;k++){
            if(rel[k] == 0) {
                r[counter++] = arr[k];
            }
        }

        return r;
    }

    public static void traverse(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {43, 23, 221, 223, 11, 34, 53, 1, 1, 1, 23, 34, 43, 14, 99, 134};
        Arrays.sort(arr);

        traverse(arr);

        int[] r = remove_duplicates(arr);

        traverse(r);
    }
}
