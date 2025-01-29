import java.util.*;

public class CheapTravel {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        Set<Long> s = new TreeSet<>();
        
        s.add(n * a);
        
        long f = n / m;
        long r = n % m;
        
        s.add(r * a + f * b);
        s.add(b * (f + 1));
        
        System.out.println(s.iterator().next());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;
        
        for (int i = 0; i < TC; i++) {
            solve();
        }
    }
}
