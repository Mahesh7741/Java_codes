import java.util.Scanner;

public class NewTheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }

            boolean check = y <= 2 * x;
            long total = 0;

            for (int i = 0; i < n; i++) {
                int cnt = 0;
                boolean white = false;

                for (int j = 0; j < m; j++) {
                    if (s[i].charAt(j) == '.') {
                        white = true;
                        cnt++;
                    } else {
                        white = false;
                        if (check) {
                            total += (cnt / 2) * y + (cnt % 2) * x;
                        } else {
                            total += cnt * x;
                        }
                        cnt = 0;
                    }
                }

                if (white) {
                    if (check) {
                        total += (cnt / 2) * y + (cnt % 2) * x;
                    } else {
                        total += cnt * x;
                    }
                }
            }

            System.out.println(total);
        }
    }
}
