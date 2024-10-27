import java.util.Scanner;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            long m = sc.nextLong();
            long ans = 0, ans1 = 0;
            int tag = 0;
            
            long N = n;
            long M = m;
            ans = ans1 = x;

            while (n-- > 0 && ans > 0) {
                ans = (ans / 2) + 10;
                if (ans <= 0) {
                    tag = 1;
                    break;
                }
            }

            while (m-- > 0 && ans > 0) {
                ans -= 10;
                if (ans <= 0) {
                    tag = 1;
                    break;
                }
            }

            while (M-- > 0 && ans1 > 0) {
                ans1 -= 10;
                if (ans1 <= 0) {
                    tag = 1;
                    break;
                }
            }

            while (N-- > 0 && ans1 > 0) {
                ans1 = (ans1 / 2) + 10;
                if (ans1 <= 0) {
                    tag = 1;
                    break;
                }
            }

            if (tag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
