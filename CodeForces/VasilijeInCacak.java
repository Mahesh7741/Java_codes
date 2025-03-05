import java.util.*;
public class VasilijeInCacak {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- >0) solve();
    }

    static void solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long x = sc.nextLong();
        long max = (n * (n + 1) - (n - k) * (n - k + 1)) / 2;
        long min = k * (k + 1) / 2;
        if (x <= max && x >= min)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
