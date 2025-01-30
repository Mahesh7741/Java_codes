import java.util.Scanner;

public class VanyaAndCubes {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cubes = 0;

        for (int i = 1; i <= n; ++i) {
            cubes += (i * i + i) / 2;
            if (cubes > n) {
                System.out.println(i - 1);
                break;
            } else if (cubes == n) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;

        while (TC-- > 0) {
            solve();
        }
    }
}
