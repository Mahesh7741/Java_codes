import java.util.Scanner;

public class WeGotEverythingCovered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (char ch = 'a'; ch < 'a' + k; ch++) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
