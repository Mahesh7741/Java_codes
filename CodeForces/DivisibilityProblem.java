import java.util.*;

public class DivisibilityProblem {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if (a % b == 0) {
            System.out.println(0);
        } else {
            long rem = a % b;
            System.out.println(b - rem);
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt(); 
        while (T-- > 0) {
            solve();
        }
    }
}
