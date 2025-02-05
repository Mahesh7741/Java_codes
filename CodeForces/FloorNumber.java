import java.util.*;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            if (n < 3) {
                System.out.println(1);
            } else {
                n = n - 2;
                int f;
                if (n % x == 0)
                    f = n / x + 1;
                else
                    f = n / x + 2;
                System.out.println(f);
            }
        }
        
        sc.close();
    }
}
