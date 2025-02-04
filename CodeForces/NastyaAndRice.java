import java.util.Scanner;

public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int ABsum = a + b;
            int ABsub = a - b;
            int CDsum = c + d;
            int CDsub = c - d;

            if ((n * ABsum >= CDsub) && (n * ABsub <= CDsum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
