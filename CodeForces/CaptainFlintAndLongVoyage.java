import java.util.Scanner;

public class CaptainFlintAndLongVoyage {
    public static void solve(int n) {
        int eights = (int) Math.ceil((double) n / 4);
        
        for (int i = 0; i < (n - eights); i++) {
            System.out.print(9);
        }
        for (int i = 0; i < eights; i++) {
            System.out.print(8);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            solve(n);
        }
    }
}
