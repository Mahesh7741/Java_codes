import java.util.*;
public class GoldMedal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T = sc.nextInt(); T-- > 0;) {
            int n = sc.nextInt(), k = sc.nextInt(), sum = 0;
            for (int i = 0; i < n; i++) sum += sc.nextInt();
            System.out.println((sum + sc.nextInt()) / k);
        }
        sc.close();
    }
}
