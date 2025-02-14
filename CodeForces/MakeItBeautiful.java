import java.util.*;

public class MakeItBeautiful {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) 
            solve();
    }

    static void solve() {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) 
            v[i] = sc.nextInt();
        
        Arrays.sort(v);

        if (v[0] == v[n - 1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.print(v[n - 1] + " ");
            for (int i = 0; i < n - 1; i++) 
                System.out.print(v[i] + " ");
            System.out.println();
        }
    }
}
