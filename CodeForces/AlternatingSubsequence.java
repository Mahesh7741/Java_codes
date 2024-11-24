import java.util.*;

public class AlternatingSubsequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }

            long max = Long.MIN_VALUE, sum = 0;
            boolean isPositive = true;

            for (int i = 0; i < n; i++) {
                if (isPositive) {
                    if (a.get(i) < 0) {
                        if (max > Long.MIN_VALUE) {
                            sum += max;
                        }
                        max = Long.MIN_VALUE;
                        isPositive = false;
                    }
                } else {
                    if (a.get(i) > 0) {
                        if (max > Long.MIN_VALUE) {
                            sum += max;
                        }
                        max = Long.MIN_VALUE;
                        isPositive = true;
                    }
                }
                max = Math.max(a.get(i), max);
            }

            if (max > Long.MIN_VALUE) {
                sum += max;
            }
            System.out.println(sum);
        }
    }
}
