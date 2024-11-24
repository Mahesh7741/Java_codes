import java.util.Scanner;

public class TernaryXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String x = sc.next();

            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();

            boolean split = false;

            for (int i = 0; i < n; i++) {
                char c = x.charAt(i);
                if (!split) {
                    if (c == '0') {
                        a.append('0');
                        b.append('0');
                    } else if (c == '1') {
                        a.append('1');
                        b.append('0');
                        split = true;
                    } else { // c == '2'
                        a.append('1');
                        b.append('1');
                    }
                } else {
                    if (c == '0') {
                        a.append('0');
                        b.append('0');
                    } else if (c == '1') {
                        a.append('0');
                        b.append('1');
                    } else { // c == '2'
                        a.append('0');
                        b.append('2');
                    }
                }
            }

            System.out.println(a);
            System.out.println(b);
        }

        sc.close();
    }
}
