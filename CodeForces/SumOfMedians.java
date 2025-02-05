import java.util.*;

public class SumOfMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TCS = 1;
        TCS = sc.nextInt();
        
        while (TCS-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long range = n * k;
        long div = n / 2;
        long sum = 0;
        ArrayList<Long> v = new ArrayList<>();
        
        for (long i = 0; i < range; i++) {
            v.add(sc.nextLong());
        }

        long j = 0;
        for (long i = range - 1 - div; i >= 0; i -= div + 1) {
            sum += v.get((int)i);
            j++;
            if (j == k) break;
        }
        
        System.out.println(sum);
    }
}
