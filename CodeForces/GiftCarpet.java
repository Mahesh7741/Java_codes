import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] carpet = new String[n];
        sc.nextLine(); // To handle the newline character after reading integers

        for (int i = 0; i < n; i++) {
            carpet[i] = sc.nextLine();
        }

        String s = "vika";
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (carpet[j].charAt(i) == s.charAt(cnt)) {
                    cnt++;
                    break;
                }
            }
        }

        if (cnt == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
