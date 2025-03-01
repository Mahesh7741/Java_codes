import java.util.*;
public class MEXanizedArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (n < k || x + 1 < k) {
                System.out.println(-1);
                continue;
            }

            int i = 0, ct = 0, sum = 0;
            while (i < k && ct < n) {
                sum += i;
                i++;
                ct++;
            }

            if (ct < n) {
                if (x != k) {
                    while (ct < n) {
                        sum += x;
                        ct++;
                    }
                } else if (x == k) {
                    x--;
                    while (ct < n) {
                        sum += x;
                        ct++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
