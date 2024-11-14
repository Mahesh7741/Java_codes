import java.util.Scanner;

public class CowsAndPokerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ch = sc.next();

        int allin = 0, in = 0, folded = 0;

        for (int i = 0; i < n; i++) {
            char c = ch.charAt(i);
            if (c == 'A') {
                allin++;
            } else if (c == 'I') {
                in++;
            } else if (c == 'F') {
                folded++;
            }
        }

        if (in == 1) {
            System.out.println("1");
        } else if (in == 0) {
            System.out.println(allin);
        } else {
            System.out.println("0");
        }
    }
}
