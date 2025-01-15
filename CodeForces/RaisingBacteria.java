import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long countOf1 = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                countOf1++;
            }
            n = n >> 1;
        }

        System.out.println(countOf1);
    }
}
