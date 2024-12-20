import java.util.*;

public class Colourblindness {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        String r1 = sc.next();
        String r2 = sc.next();

        char[] r1Arr = r1.toCharArray();
        char[] r2Arr = r2.toCharArray();

        for (int i = 0; i < n; i++) {
            if (r1Arr[i] == 'G') {
                r1Arr[i] = 'B';
            }
            if (r2Arr[i] == 'G') {
                r2Arr[i] = 'B';
            }
        }

        String newR1 = new String(r1Arr);
        String newR2 = new String(r2Arr);

        if (newR1.equals(newR2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
