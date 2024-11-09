import java.util.*;

public class BeautifulDivisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        List<Long> v = new ArrayList<>();
        long num = 0, j = 1;

        while (true) {
            num = (long) ((Math.pow(2, j) - 1) * Math.pow(2, j - 1));
            j++;
            if (num < 100001) {
                v.add(num);
            } else {
                break;
            }
        }

        long ans = 0;
        for (long val : v) {
            if (val <= n && n % val == 0) {
                ans = val;
            } else if (val > n) {
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
