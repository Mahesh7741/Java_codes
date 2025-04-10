import java.util.*;
import static java.lang.Math.*;

public class RunningStudent {
    static final double EPS = 1e-8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int fs = sc.nextInt();
        int fy = sc.nextInt();

        double minTime = Double.MAX_VALUE;
        int ans = -1;

        for (int i = 1; i < n; i++) {
            double t1 = (double) v[i] / b;
            double d = sqrt(pow(fs - v[i], 2) + pow(fy, 2));
            double t2 = d / s;
            double total = t1 + t2;

            if (total < minTime - EPS) {
                minTime = total;
                ans = i + 1;
            } else if (abs(total - minTime) < EPS) {
                double prevDist = sqrt(pow(fs - v[ans - 1], 2) + pow(fy, 2));
                if (d < prevDist) {
                    ans = i + 1;
                    minTime = total;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
