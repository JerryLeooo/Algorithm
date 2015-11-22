package fundamentals;

/**
 * Created by leo on 11/22/15.
 */
public class EX_1_1_19 {
    public static long Fib(int N) {

        if(N<=2) {
            return 1;
        }

        long a = 1;
        long b = 1;
        long c = 0;
        int counter=2;

        while(counter<N) {
            c = a + b;
            a = b;
            b = c;
            counter ++;
        }

        // 1,1,2,3,5,8,13,21,34,55

        return c;
    }

    public static void main(String[] args) {
        System.out.println(Fib(1));
        System.out.println(Fib(2));
        System.out.println(Fib(3));
        System.out.println(Fib(10));
        System.out.println(Fib(100));
    }
}
