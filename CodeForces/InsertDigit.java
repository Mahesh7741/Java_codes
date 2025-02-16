import java.util.*;

public class InsertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        while (TC-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        String s = sc.next();
        
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); ++i) {
            if (c > sb.charAt(i)) {
                sb.insert(i, c);
                System.out.println(sb);
                return;
            }
        }
        sb.append(c);
        System.out.println(sb);
    }
}
