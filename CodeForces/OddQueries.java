import java.util.*;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        v.add(0);
        int ct = 0;

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if ((x & 1) == 1) 
                ct++;
            v.add(ct);
        }

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            
            int rm = v.get(r) - v.get(l - 1);
            int odd = ct - v.get(r) + v.get(l - 1);

            if ((k & 1) == 1)
                odd += (r - l + 1);

            if ((odd & 1) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
