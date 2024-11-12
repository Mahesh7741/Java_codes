import java.util.Scanner;

public class GameOfRobots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            long[] a = new long[(int) (n + 1)];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            long pos = 0;
            for (long i = 1;; i++) {
                if (i * (i + 1) / 2 == m) {
                    pos = i;
                    break;
                }
                if (i * (i + 1) / 2 > m) {
                    pos = m - (i * (i - 1) / 2);
                    break;
                }
            }

            System.out.println(a[(int) pos]);
        }

        sc.close();
    }
}
