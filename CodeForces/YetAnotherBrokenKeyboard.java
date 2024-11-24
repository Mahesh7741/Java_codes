import java.util.*;

public class YetAnotherBrokenKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        boolean[] a = new boolean[26];

        for (int i = 0; i < k; i++) {
            char c = sc.next().charAt(0);
            a[c - 'a'] = true;
        }

        long len = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[s.charAt(i) - 'a']) {
                len++;
            } else {
                ans += (len * (len + 1)) / 2;
                len = 0;
            }
        }

        if (len > 0) {
            ans += (len * (len + 1)) / 2;
        }

        System.out.println(ans);
    }
}
