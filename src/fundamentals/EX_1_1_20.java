package fundamentals;

import java.lang.Math;

/**
 * Created by leo on 11/22/15.
 */
public class EX_1_1_20 {
    public static double ln(int N) {
        double sum = 0;
        for(int n=N;n>0;n--) {
            sum += Math.log(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
