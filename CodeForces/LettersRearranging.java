import java.util.*;

public class LettersRearranging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            String r = new StringBuilder(s).reverse().toString();
            int len = s.length();
            boolean isPalindrome = s.equals(r);
            Set<Character> uniqueChars = new HashSet<>();
            
            for (int i = 0; i < len; i++) {
                uniqueChars.add(s.charAt(i));
            }
            
            if (!isPalindrome) {
                System.out.println(s);
            } else if (uniqueChars.size() == 1) {
                System.out.println(-1);
            } else {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                System.out.println(new String(chars));
            }
        }
        sc.close();
    }
}
