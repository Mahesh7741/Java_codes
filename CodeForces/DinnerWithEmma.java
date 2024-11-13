import java.util.ArrayList;
import java.util.Scanner;

public class DinnerWithEmma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Long> v = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long min = 100000000000L;

                for (int j = 0; j < m; j++) {
                    long cost = sc.nextLong();
                    if (cost < min) {
                        min = cost;
                    }
                }
                v.add(min);
            }

            long cost = 0;
            for (long value : v) {
                if (value > cost) {
                    cost = value;
                }
            }

            System.out.println(cost);
        }

        sc.close();
    }
}
