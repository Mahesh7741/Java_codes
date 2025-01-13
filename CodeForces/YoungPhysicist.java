import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
