package fundamentals;

/**
 * Created by leo on 11/22/15.
 */
public class EX_1_1_25 {
    public static int gcd(int p, int q) {
        int m, n;

        if (p>q) {
            m = p;
            n = q;
        }
        else {
            m = q;
            n = p;
        }

        while(m % n != 0) {
            int c = m % n;
            m = n;
            n = c;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 24));
        System.out.println(gcd(12, 34));
        System.out.println(gcd(12, 64));
        System.out.println(gcd(1, 24));
        System.out.println(gcd(2, 24));
        System.out.println(gcd(3, 24));
    }
}
