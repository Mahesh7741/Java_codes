import java.util.*;

public class ArdentFlames {
    static class Event {
        long pos;
        int type; 

        Event(long pos, int type) {
            this.pos = pos;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            long[] h = new long[n];
            long[] x = new long[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextLong();
            }

            long low = 1, high = (long) 1e9;
            long answer = -1;

            while (low <= high) {
                long mid = (low + high) / 2;
                List<Event> events = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    long requiredDamage = (h[i] + mid - 1) / mid;
                    if (requiredDamage > m) {
                        continue;
                    }
                    long delta = m - requiredDamage;
                    long left = x[i] - delta;
                    long right = x[i] + delta;

                    events.add(new Event(left, 1));
                    events.add(new Event(right + 1, -1));
                }

                if (events.isEmpty()) {
                    low = mid + 1;
                    continue;
                }

                events.sort((a, b) -> {
                    if (a.pos != b.pos) {
                        return Long.compare(a.pos, b.pos);
                    }
                    return Integer.compare(b.type, a.type); 
                });

                long cnt = 0;
                boolean found = false;

                for (int i = 0; i < events.size(); i++) {
                    cnt += events.get(i).type;

                    if (i + 1 < events.size() && events.get(i).pos == events.get(i + 1).pos) {
                        continue;
                    }

                    if (cnt >= k) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(answer);
        }
        sc.close();
    }
}
