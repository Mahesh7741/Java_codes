import java.util.*;

public class SharkySurfing {
    static Scanner sc = new Scanner(System.in);

    static class Hurdle {
        long start;
        long end;

        Hurdle(long start, long end) {
            this.start = start;
            this.end = end;
        }
    }

    static class PowerUp {
        long position;
        long value;

        PowerUp(long position, long value) {
            this.position = position;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long L = sc.nextLong();

            List<Hurdle> hurdles = new ArrayList<>();
            List<PowerUp> powerups = new ArrayList<>();
            PriorityQueue<Long> availablePowerups = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; ++i) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                hurdles.add(new Hurdle(l, r));
            }

            for (int i = 0; i < m; ++i) {
                long x = sc.nextLong();
                long v = sc.nextLong();
                powerups.add(new PowerUp(x, v));
            }

            long currentPower = 1;
            int collectedIndex = 0;
            long totalCollected = 0;
            boolean reachable = true;

            for (Hurdle hurdle : hurdles) {
                while (collectedIndex < m && powerups.get(collectedIndex).position < hurdle.start) {
                    availablePowerups.offer(powerups.get(collectedIndex).value);
                    collectedIndex++;
                }

                long requiredPower = hurdle.end - hurdle.start + 2;

                while (currentPower < requiredPower) {
                    if (availablePowerups.isEmpty()) {
                        reachable = false;
                        break;
                    }
                    currentPower += availablePowerups.poll();
                    totalCollected++;
                }

                if (!reachable) {
                    totalCollected = -1;
                    break;
                }
            }

            System.out.println(totalCollected);
        }
    }
}
