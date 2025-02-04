import java.util.*;

public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        
        while (TC-- > 0) {
            solve(sc);
        }
        
        sc.close();
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ct = 0;

        while (a != b) {
            if (a > b) {
                int d = a - b;
                if (d % 2 == 0) {
                    a -= d;
                } else {
                    a -= (d + 1);
                }
                ct++;
            } else {
                int d = b - a;
                if (d % 2 != 0) {
                    a += d;
                } else {
                    a += (d - 1);
                }
                ct++;
            }
        }

        System.out.println(ct);
    }
}
