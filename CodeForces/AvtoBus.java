import java.util.*;
public class AvtoBus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n % 2 == 1 || n < 4) {
                System.out.println(-1);
            } else {
                long mn = n / 6;
                if (n % 6 != 0) mn++;
                long mx = n / 4;
                System.out.println(mn + " " + mx);
            }
        }
    }
}
