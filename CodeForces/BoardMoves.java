import java.util.*;
public class BoardMoves {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0, temp = 8;
            for (int i = 1; i <= n / 2; i++) {
                ans += (temp * i);
                temp += 8;
            }
            System.out.println(ans);
        }
    }
}
