import java.util.Scanner;

public class Emotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();

        long fmax = 0, smax = 0;

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();

            if (temp > fmax) {
                smax = Math.max(fmax, smax);
                fmax = temp;
            } else if (temp > smax) {
                smax = temp;
            }
        }

        long ans = 0;
        long temp = m / (k + 1);

        ans += (temp * smax);
        temp = m - temp;
        ans += (temp * fmax);

        System.out.println(ans);

        sc.close();
    }
}
