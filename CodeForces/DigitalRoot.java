import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        while (n-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();
            System.out.println(((k - 1) * 9) + x);
        }

        sc.close();
    }
}
