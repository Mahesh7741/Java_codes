import java.util.ArrayList;
import java.util.Scanner;

public class AlyaAndPermutation {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println(n);
            System.out.print("2");
            for (int i = 4; i <= n - 2; i++) {
                System.out.print(" " + i);
            }
            System.out.println(" 3 1 " + (n - 1) + " " + n);
        } else {
            boolean[] tag = new boolean[n + 1];
            ArrayList<Integer> vc = new ArrayList<>();
            vc.add(6);
            vc.add(1);
            vc.add(5);
            vc.add(2);
            vc.add(3);
            vc.add(4);

            int F = 7;
            while (F < n) {
                vc.add(F);
                vc.add(F + 1);
                F = (F << 1) | 1;
            }
            System.out.println(F);
            for (int x : vc) {
                tag[x] = true;
            }
            for (int i = 1; i <= n; i++) {
                if (!tag[i]) {
                    System.out.print(i + " ");
                }
            }
            for (int x : vc) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
}
