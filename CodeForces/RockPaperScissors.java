import java.util.*;

public class RockPaperScissors {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new RockPaperScissors().solve();
    }

    void solve() {
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        int m = s1.length(), k = s2.length();
        int l = lcm(m, k);

        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);

        for (int i = 0; i <= l / m; i++) str1.append(s1);
        for (int i = 0; i <= l / k; i++) str2.append(s2);

        int p = n / l;
        int q = n % l;
        long ct1 = 0, ct2 = 0, ans1 = 0, ans2 = 0;

        for (int i = 0; i < l && i < n; ++i) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);

            if (a == 'R') {
                if (b == 'P') ct1++;
                else if (b == 'S') ct2++;
            } else if (a == 'P') {
                if (b == 'R') ct2++;
                else if (b == 'S') ct1++;
            } else if (a == 'S') {
                if (b == 'R') ct1++;
                else if (b == 'P') ct2++;
            }

            if (i == q - 1) {
                ans1 = ct1;
                ans2 = ct2;
            }
        }

        System.out.println((p * ct1 + ans1) + " " + (p * ct2 + ans2));
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
