import java.util.*;
public class NumberGame {
    static Scanner sc = new Scanner(System.in);
    
    static int turns(int n) {
        int cnt = 0;
        if (n == 1)
            return 0;
        if (n % 2 != 0 || n == 2)
            return 1;
        else {
            boolean found = false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 != 0) {
                        found = true;
                        if (cnt == 0)
                            cnt = turns(n / i) + 1;
                        else if (cnt % 2 == 0)
                            cnt = turns(n / i) + 1;
                    }
                    if ((n / i) % 2 != 0) {
                        found = true;
                        if (cnt == 0)
                            cnt = turns(i) + 1;
                        else if (cnt % 2 == 0)
                            cnt = turns(i) + 1;
                    }
                }
            }
            if (!found)
                cnt += 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int cnt = turns(n);
            if (cnt % 2 != 0)
                System.out.println("Ashishgup");
            else
                System.out.println("FastestFinger");
        }
    }
}
