import java.util.*;

public class InterestingDrink {
    
    public static long getBottles(List<Long> arr, long m) {
        int low = 0, high = arr.size() - 1;
        long ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= m) {
                ans = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLong());
        }

        Collections.sort(arr);

        int q = sc.nextInt();
        while (q-- > 0) {
            long m = sc.nextLong();
            System.out.println(getBottles(arr, m));
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
