import java.util.Scanner;

public class DiceTower {

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long x = n % 14;

        if (n > 14 && x > 0 && x < 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            solve(sc);
        }
        
        sc.close();
    }
}
