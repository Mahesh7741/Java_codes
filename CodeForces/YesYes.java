import java.util.Scanner;

public class YesYes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        sc.nextLine();  

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < 18; i++) {
            s.append("Yes");
        }

        String t = sc.nextLine();

        if (s.toString().contains(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
