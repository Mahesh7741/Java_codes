import java.util.*;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int odd = 0, even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 1) {
                    odd++;
                } else {
                    even++;
                }
            }

            if (odd == 0) {
                System.out.println("NO");
            } else if (even == 0 && n % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
