import java.util.Scanner;

public class TwoTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        sc.nextLine();  

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.nextLine(); 

        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder(a);
        a = sb.reverse().toString();

        b += a;

        int breakPoint = 0;

        for (int i = 0; i < n + m - 1; i++) {
            if (b.charAt(i) == 'R' && b.charAt(i + 1) == 'R') {
                breakPoint++;
            } else if (b.charAt(i) == 'B' && b.charAt(i + 1) == 'B') {
                breakPoint++;
            }
        }

        if (breakPoint == 0 || breakPoint == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
