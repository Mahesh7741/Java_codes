import java.util.*;

public class ArrayStabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> a = new ArrayList<>();
        
        for (long i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        
        Collections.sort(a);
        
        // Calculate the two possible minimal differences
        long ans1 = a.get((int)n - 2) - a.get(0);
        long ans2 = a.get((int)n - 1) - a.get(1);
        long ans = Math.min(ans1, ans2);
        
        System.out.println(ans);
        sc.close();
    }
}
