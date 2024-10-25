import java.util.*;

public class SubstringRemovalGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            List<Integer> ls = new ArrayList<>();
            int cnt = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    cnt++;
                } else {
                    if (cnt > 0) {
                        ls.add(cnt);
                        cnt = 0;
                    }
                }
            }
            
            if (cnt > 0) {
                ls.add(cnt);
            }
            
            Collections.sort(ls, Collections.reverseOrder());
            
            int alice = 0;
            int bob = 0;
            for (int i = 0; i < ls.size(); i++) {
                if (i % 2 == 0) {
                    alice += ls.get(i);
                } else {
                    bob += ls.get(i);
                }
            }
            
            System.out.println(alice);
        }
        
        sc.close();
    }
}
