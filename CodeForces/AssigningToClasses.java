import java.util.*;

public class AssigningToClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long idx = n;
            n = n * 2;

            List<Long> v = new ArrayList<>();
            for (long i = 0; i < n; i++) {
                long a = sc.nextLong();
                v.add(a);
            }

            Collections.sort(v);

            long ans = Math.abs(v.get((int) idx - 1) - v.get((int) idx));
            System.out.println(ans);
        }
        
        sc.close();
    }
}
