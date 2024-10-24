import java.util.Scanner;

public class DivideIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int ans = 0;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    ans++;
                } else if (n % 3 == 0) {
                    n = (2 * n) / 3;
                    ans++;
                } else if (n % 5 == 0) {
                    n = (4 * n) / 5;
                    ans++;
                } else {
                    System.out.println(-1);
                    break;
                }
                if (n == 1) {
                    System.out.println(ans);
                    break;
                }
            }
        }
        sc.close();
    }
}
