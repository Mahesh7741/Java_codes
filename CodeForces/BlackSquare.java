import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d, ans;
        String s;
        while (sc.hasNext()) {
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            d = sc.nextLong();
            s = sc.next();
            ans = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    ans += a;
                } else if (ch == '2') {
                    ans += b;
                } else if (ch == '3') {
                    ans += c;
                } else if (ch == '4') {
                    ans += d;
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
