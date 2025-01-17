import java.util.*;

public class PrimeDeletion {
    static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        for (char ch : s.toCharArray()) {
            if (ch == '1') 
                return false;
            else if (ch == '3') 
                return true;
        }
        return false;
    }

    public static void solve() {
        String s = sc.next();
        if (!check(s))
            System.out.println(13);
        else if (check(s))
            System.out.println(31);
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        long T = sc.nextLong();
        while (T-- > 0) {
            solve();
        }
    }
}
