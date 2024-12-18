import java.util.Scanner;

public class Haiku {
    static Scanner sc = new Scanner(System.in);

    public static int countVowels(String s) {
        int countOfVowels = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countOfVowels++;
            }
        }
        return countOfVowels;
    }

    public static void solve() {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int c1 = countVowels(s1);
        int c2 = countVowels(s2);
        int c3 = countVowels(s3);

        if (c1 == 5 && c2 == 7 && c3 == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int T = 1;
        while (T-- > 0) {
            solve();
        }
    }
}
