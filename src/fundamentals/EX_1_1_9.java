package fundamentals;

/**
 * Created by leo on 11/21/15.
 */
public class EX_1_1_9 {
    public static void binary(int N) {

        String s = new String("");

        for(int n = N; n > 0; n /= 2) {
            s = n % 2 + s;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        binary(17);
        binary(37);
    }
}
