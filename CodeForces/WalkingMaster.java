import java.util.*;

public class WalkingMaster { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        if (b > d || c - a > d - b)
            System.out.println(-1);
        else
            System.out.println(2 * (d - b) + a - c);
    }
}
