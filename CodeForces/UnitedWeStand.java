import java.util.*;
public class UnitedWeStand {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        if (arr[0] == arr[n - 1]) {
            System.out.println(-1);
            return;
        }

        int itr = 0;
        while (arr[itr] == arr[0]) {
            itr++;
        }

        System.out.println(itr + " " + (n - itr));
        
        for (int i = 0; i < itr; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = itr; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
