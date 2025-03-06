import java.util.*;
public class ThreeThreadlets {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        TreeMultiset multiset = new TreeMultiset();
        for (int i = 0; i < 3; i++) {
            multiset.add(sc.nextInt());
        }
        for (int i = 0; i < 3 && multiset.first() != multiset.last(); i++) {
            multiset.add(multiset.first());
            multiset.add(multiset.last() - multiset.first());
            multiset.remove(multiset.last());
        }
        if (multiset.first() == multiset.last()) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
    
    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) solve();
    }
}

class TreeMultiset {
    private TreeMap<Integer, Integer> map = new TreeMap<>();
    
    public void add(int value) {
        map.put(value, map.getOrDefault(value, 0) + 1);
    }
    
    public void remove(int value) {
        if (map.containsKey(value)) {
            if (map.get(value) > 1) 
                map.put(value, map.get(value) - 1);
            else 
                map.remove(value);
        }
    }
    
    public int first() {
        return map.firstKey();
    }
    
    public int last() {
        return map.lastKey();
    }
}
