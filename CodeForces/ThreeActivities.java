import java.util.*;

public class ThreeActivities {
	
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        List<List<Pair>> v = new ArrayList<>();

        // Initialize lists
        for (int i = 0; i < 3; i++) {
            v.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                long val = sc.nextLong();
                v.get(i).add(new Pair(val, j));
            }
        }

        for (int i = 0; i < 3; i++) {
            v.get(i).sort((a, b) -> Long.compare(b.first, a.first));
        }

        long ans = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (v.get(0).get(i).second != v.get(1).get(j).second &&
                        v.get(1).get(j).second != v.get(2).get(k).second &&
                        v.get(2).get(k).second != v.get(0).get(i).second) {
                        ans = Math.max(ans, v.get(0).get(i).first + v.get(1).get(j).first + v.get(2).get(k).first);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    static class Pair {
        long first;
        int second;

        Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
