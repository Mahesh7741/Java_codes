import java.util.*;
public class Rebellion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int ct = 0;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (a[i] == 1 && a[j] == 0) ct++;
            else if (a[i] == 1 && a[j] == 1) i--;
            else if (a[i] == 0 && a[j] == 0) j++;
        }
        System.out.println(ct);
    }
}
