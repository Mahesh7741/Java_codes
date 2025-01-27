import java.util.*;

public class AlternatingCurrent {
    public static void main(String[] args) {
        new AlternatingCurrent().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else if (s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }
        
        if (st.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
