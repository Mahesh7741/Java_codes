import java.util.*;
public class NotACheapString {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.next();
        long p = sc.nextLong();

        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        StringBuilder sorted = new StringBuilder(new String(temp)).reverse();

        long totalSum = 0;
        for (int i = 0; i < sorted.length(); i++) {
            totalSum += (sorted.charAt(i) - 'a' + 1);
        }

        Map<Character, Long> hMap = new HashMap<>();
        for (int i = 0; i < sorted.length(); i++) {
            if (totalSum > p) {
                hMap.put(sorted.charAt(i), hMap.getOrDefault(sorted.charAt(i), 0L) + 1);
                totalSum -= (sorted.charAt(i) - 'a' + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hMap.getOrDefault(ch, 0L) > 0) {
                hMap.put(ch, hMap.get(ch) - 1);
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
