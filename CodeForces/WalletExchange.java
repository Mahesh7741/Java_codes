import java.util.*;

public class WalletExchange {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if ((a + b) % 2 == 1)
            System.out.println("Alice");
        else
            System.out.println("Bob");
    }
}
