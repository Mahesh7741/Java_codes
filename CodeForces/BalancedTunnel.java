import java.util.*;

public class BalancedTunnel {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfCars = sc.nextInt();

        List<Pair> details = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            details.add(new Pair(0, 0));
        }

        for (int i = 0; i < numberOfCars; i++) {
            int x = sc.nextInt();
            details.get(x - 1).first = i + 1;
        }

        for (int i = 0; i < numberOfCars; i++) {
            int x = sc.nextInt();
            details.get(x - 1).second = i + 1;
        }

        details.sort(Comparator.comparingInt(a -> a.first));

        int cnt = 0, mx = 0;

        for (Pair pair : details) {
            if (pair.second < mx) {
                cnt++;
            }
            mx = Math.max(mx, pair.second);
        }

        System.out.println(cnt);
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
