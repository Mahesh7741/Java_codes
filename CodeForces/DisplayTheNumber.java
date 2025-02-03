import java.util.*;

public class DisplayTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            long n = sc.nextLong();
            StringBuilder s = new StringBuilder();

            if (n % 2 == 1) {
                s.append("7");
                int m = (int) (n / 2 - 1);
                for (int i = 0; i < m; i++) {
                    s.append("1");
                }
            } else {
                int m = (int) (n / 2);
                for (int i = 0; i < m; i++) {
                    s.append("1");
                }
            }

            System.out.println(s);
        }
        
        sc.close();
    }
}
