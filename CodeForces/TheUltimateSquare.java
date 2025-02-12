import java.util.*;
public class TheUltimateSquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        long n = sc.nextLong();
        if ((n & 1) == 1) 
            n++;
        System.out.println(n / 2);
    }
}
