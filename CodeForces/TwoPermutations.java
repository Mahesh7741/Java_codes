import java.util.*;

public class TwoPermutations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if (n == a && n == b) 
            System.out.println("YES");
        else if (a + b < n - 1) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}
