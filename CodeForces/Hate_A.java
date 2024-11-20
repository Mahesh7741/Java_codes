import java.util.*;

public class Hate_A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int n = s.length();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                cnt++;
            }
        }

        int k = 0, idx = 0;
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (k == cnt) break;

            if (s.charAt(i) == 'a') {
                k++;
                idx = i + 1;
            } else {
                s2.append(s.charAt(i));
            }
        }

        k = n - idx;
        k -= s2.length();

        if (k % 2 == 0) {
            k /= 2;
            int j = idx;
            idx += k;

            while (k > 0) {
                s2.append(s.charAt(j));
                j++;
                k--;
            }

            k = s.length() - 1;
            for (int i = s2.length() - 1; i >= 0; i--) {
                if (s2.charAt(i) != s.charAt(k)) {
                    System.out.println(":(");
                    return;
                }
                k--;
            }

            for (int i = 0; i < idx; i++) {
                System.out.print(s.charAt(i));
            }
        } else {
            System.out.println(":(");
        }
    }
}
