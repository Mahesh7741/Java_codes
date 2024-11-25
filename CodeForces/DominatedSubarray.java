import java.util.*;

public class DominatedSubarray { 
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Map<Integer, Integer> lastSeen = new HashMap<>();
            int minLength = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (lastSeen.containsKey(a[i])) {
                    minLength = Math.min(minLength, i - lastSeen.get(a[i]) + 1);
                }
                lastSeen.put(a[i], i);
            }
            
            System.out.println(minLength == Integer.MAX_VALUE ? -1 : minLength);
        }
    }
}
