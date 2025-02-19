import java.util.Scanner;

public class MrPerfectlyFine {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int t = Integer.MAX_VALUE, t1 = Integer.MAX_VALUE, t2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            String s = sc.next();
            
            if (s.charAt(0) == '1') t1 = Math.min(x, t1);
            if (s.charAt(1) == '1') t2 = Math.min(x, t2);
            if (s.charAt(0) == '1' && s.charAt(1) == '1') t = Math.min(x, t);
        }

        if (t1 == Integer.MAX_VALUE || t2 == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(Math.min(t, t1 + t2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) solve(sc);
        sc.close();
    }
}
