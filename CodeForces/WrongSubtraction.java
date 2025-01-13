import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        while (k-- > 0) {
            if (n % 10 != 0) {
                n--;
            } else {
                n /= 10;
            }
        }

        System.out.println(n);
    }
}
