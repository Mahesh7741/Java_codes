import java.util.*;
public class MKnezConstructiveForcesTask {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            if (n == 3) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            if (n % 2 == 1) {
                int k = (n - 1) / 2;
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    if (flag) {
                        System.out.print((k - 1) + " ");
                        flag = false;
                    } else {
                        System.out.print((-k) + " ");
                        flag = true;
                    }
                }
            } else {
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    if (flag) {
                        System.out.print(1 + " ");
                        flag = false;
                    } else {
                        System.out.print(-1 + " ");
                        flag = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
