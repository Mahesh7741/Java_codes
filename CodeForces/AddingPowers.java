import java.util.*;
public class AddingPowers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int num = sc.nextInt();
            int m = sc.nextInt();
            Map<Integer, Integer> mpp = new HashMap<>();

            for (int i = 0; i < num; i++) {
                long n = sc.nextLong();
                int pos = 0;
                while (n > 0) {
                    mpp.put(pos, mpp.getOrDefault(pos, 0) + (int) (n % m));
                    n /= m;
                    pos++;
                }
            }

            boolean ok = true;
            for (int value : mpp.values()) {
                if (value > 1) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
