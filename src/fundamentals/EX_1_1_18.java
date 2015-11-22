package fundamentals;

/**
 * Created by leo on 11/22/15.
 */

public class EX_1_1_18
{
    public static int mystery1(int a, int b)
    {
        System.out.printf("%3d, %3d\n", a, b);
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a+a, b/2);
        return mystery1(a+a, b/2) + a;
    }

    public static int mystery2(int a, int b)
    {
        System.out.printf("%7d, %3d\n", a, b);
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + mystery1(5, 7));
        System.out.println();
        System.out.println("Result: " + mystery2(5, 7));
    }
}
