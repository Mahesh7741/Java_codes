import java.util.*;

public class VanyaAndLanterns {
    
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] lamps = new int[n];
        
        for (int i = 0; i < n; i++) {
            lamps[i] = sc.nextInt();
        }
        
        Arrays.sort(lamps);
        
        int mx = 0;
        for (int i = 1; i < n; i++) {
            int x = lamps[i] - lamps[i - 1];
            mx = Math.max(x, mx);
        }
        
        double dis = Math.max(lamps[0] - 0, l - lamps[n - 1]);
        System.out.printf("%.10f\n", Math.max(dis, (double) mx / 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;

        while (TC-- > 0) {
            solve();
        }
    }
}
