import java.util.Scanner;

public class XORAverage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();

        if (n % 2 == 1) { 
            for (int i = 0; i < n; i++) {
                System.out.print(1 + " ");
            }
        } else { 
            System.out.print(1 + " " + 3 + " ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(2 + " ");
            }
        }
        System.out.println();
    }
}
