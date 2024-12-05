import java.util.*;

public class Division {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long x = sc.nextLong();

        if (x <= 1399) {
            System.out.println("Division 4");
        } else if (x >= 1400 && x <= 1599) {
            System.out.println("Division 3");
        } else if (x >= 1600 && x <= 1899) {
            System.out.println("Division 2");
        } else {
            System.out.println("Division 1");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
