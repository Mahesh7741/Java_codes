import java.util.Scanner;

public class TernaryXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);

                if (ch == '0') {
                    a.append('0');
                    b.append('0');
                } else if (ch == '1') {
                    if (a.toString().compareTo(b.toString()) >= 0) {
                        a.append('0');
                        b.append('1');
                    } else {
                        a.append('1');
                        b.append('0');
                    }
                } else if (ch == '2') {
                    if (a.toString().compareTo(b.toString()) > 0) {
                        a.append('0');
                        b.append('2');
                    } else if (a.toString().compareTo(b.toString()) == 0) {
                        a.append('1');
                        b.append('1');
                    } else {
                        a.append('2');
                        b.append('0');
                    }
                }
            }

            System.out.println(a);
            System.out.println(b);
        }

        sc.close();
    }
}
