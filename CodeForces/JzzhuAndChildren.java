import java.util.*;

public class JzzhuAndChildren {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long m = sc.nextLong();

        Queue<long[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            q.add(new long[]{temp, i + 1});
        }

        long lastMan = 0;

        while (!q.isEmpty()) {
            long[] front = q.poll();
            long currEle = front[0];
            long currInd = front[1];

            lastMan = currInd;

            if (currEle > m) {
                currEle -= m;
                q.add(new long[]{currEle, currInd});
            }
        }

        System.out.println(lastMan);
    }

    public static void main(String[] args) {
        solve();
    }
}
