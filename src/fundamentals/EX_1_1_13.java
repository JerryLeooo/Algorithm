package fundamentals;

/**
 * Created by leo on 11/21/15.
 */
public class EX_1_1_13 {
    public static void transposition(int[][] matrix, int M, int N) {
        for(int j = N-1; j >= 0; j--) {
            for(int i = 0; i < M; i++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        int M = 10;
        int N = 10;
        int[][] matrix = new int[M][N];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                matrix[i][j] = i;
            }
        }

        System.out.println("");

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.print("\n");
        }

        transposition(matrix, M, N);
    }
}
