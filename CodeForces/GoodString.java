import java.util.*;

public class GoodString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            List<Character> v = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                if (v.size() % 2 == 0 || !v.get(v.size() - 1).equals(s.charAt(i))) {
                    v.add(s.charAt(i));
                }
            }

            if (v.size() % 2 == 1) {
                v.remove(v.size() - 1);
            }

            int result = s.length() - v.size();
            System.out.println(result);
        }
    }
}
