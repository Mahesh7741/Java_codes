import java.util.*;
public class AmbitiousKid {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Long> v = new ArrayList<>();
        
        for (int i = 0; i < n; ++i) {
            long x = sc.nextLong();
            if (x < 0) x = -x;
            v.add(x);
        }
        
        Collections.sort(v);
        System.out.println(v.get(0));
    }
}
