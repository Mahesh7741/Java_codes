import java.util.*;

public class ConstructTheString {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder s = new StringBuilder();
        char[] c = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < n; i++) {
            s.append(c[i % b]);
        }

        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
}
