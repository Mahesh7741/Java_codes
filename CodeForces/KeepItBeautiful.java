import java.util.*;

public class KeepItBeautiful {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        StringBuilder s = new StringBuilder("1");
        int last = v.get(0);
        boolean increase = true;

        for (int i = 1; i < n; i++) {
            if (v.get(i) >= last && increase) {
                s.append('1');
                last = v.get(i);
            } else if (v.get(i) < last && v.get(0) >= v.get(i) && increase) {
                increase = false;
                last = v.get(i);
                s.append('1');
            } else if (v.get(i) >= last && v.get(i) <= v.get(0)) {
                last = v.get(i);
                s.append('1');
            } else {
                s.append('0');
            }
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        int TC = sc.nextInt();
        sc.nextLine(); 
        while (TC-- > 0) {
            solve();
        }
    }
}
