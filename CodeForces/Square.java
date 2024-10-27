import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long a1 = sc.nextLong();
            long b1 = sc.nextLong();

            if (a > b) {
                long temp = a;
                a = b;
                b = temp;
            }
            if (a1 > b1) {
                long temp = a1;
                a1 = b1;
                b1 = temp;
            }

            if (a + a1 == b && a + a1 == b1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
