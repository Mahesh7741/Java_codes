import java.util.*;

public class Exchange {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println((n + a - 1) / a);
        }
    }
}
