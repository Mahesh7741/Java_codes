import java.util.*;

public class GeorgeAndAccommodation {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long avaRooms = 0;

        while (n-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();

            if (q - p >= 2) {
                avaRooms++;
            }
        }

        System.out.println(avaRooms);
    }

    public static void main(String[] args) {
        solve();
    }
}
