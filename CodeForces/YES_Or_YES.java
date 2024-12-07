import java.util.Scanner;

public class YES_Or_YES {
    public static void solve(Scanner sc) {
        String s = sc.next();
        if ((s.charAt(0) == 'Y' || s.charAt(0) == 'y') &&
            (s.charAt(1) == 'E' || s.charAt(1) == 'e') &&
            (s.charAt(2) == 'S' || s.charAt(2) == 's')) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
