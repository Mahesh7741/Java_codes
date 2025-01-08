import java.util.*;
public class PrintAPedestal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        long n = sc.nextLong();

        if (n % 3 == 0) {
            long rem = n / 3;
            System.out.println(rem + " " + (rem + 1) + " " + (rem - 1));
        } else if (n % 3 == 1) {
            long rem = n / 3;
            System.out.println(rem + " " + (rem + 2) + " " + (rem - 1));
        } else {
            long rem = n / 3;
            System.out.println((rem + 1) + " " + (rem + 2) + " " + (rem - 1));
        }
    }
}
