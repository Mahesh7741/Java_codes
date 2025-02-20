import java.util.*;

public class NewPalindrome {
    public static void solve(Scanner sc) {
        String s = sc.next();
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        if (freqMap.size() > 2) {
            System.out.println("YES");
        } else if (freqMap.size() < 2) {
            System.out.println("NO");
        } else {
            for (int count : freqMap.values()) {
                if (count < 2) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
