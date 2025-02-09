import java.util.*;
public class Lucky {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.next();
        int first_sum = 0, last_sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < 3) first_sum += s.charAt(i);
            else last_sum += s.charAt(i);
        }
        
        System.out.println(first_sum == last_sum ? "YES" : "NO");
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        sc.nextLine();
        while (TC-- > 0) solve();
    }
}
