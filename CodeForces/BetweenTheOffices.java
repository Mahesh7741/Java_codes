import java.util.Scanner;

public class BetweenTheOffices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        String s = sc.next();

        long countOfSF = 0, countOfFS = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'S' && s.charAt(i + 1) == 'F') {
                countOfSF++;
            } else if (s.charAt(i) == 'F' && s.charAt(i + 1) == 'S') {
                countOfFS++;
            }
        }

        if (countOfSF > countOfFS) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
