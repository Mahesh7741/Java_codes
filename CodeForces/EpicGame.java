import java.util.Scanner;

public class EpicGame {
   
    public static int GCD(int m, int n) {
        int r;
        while ((r = m % n) != 0) {
            m = n;
            n = r;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        while (true) {
            n -= GCD(a, n);
            if (n == 0) {
                System.out.println(0);
                break;
            }
            n -= GCD(b, n);
            if (n == 0) {
                System.out.println(1);
                break;
            }
        }
        sc.close();
    }
}
