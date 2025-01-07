import java.util.*;
public class WonderfulColoringOne {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        sc.nextLine(); 
        while (T-- > 0) {
            solve();
        }
    }

    public static void solve() {
        String s = sc.nextLine();

        Map<Character, Long> hMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hMap.put(s.charAt(i), hMap.getOrDefault(s.charAt(i), 0L) + 1);
        }

        long countOfDistinct = 0, countOfRepeated = 0;

        for (Map.Entry<Character, Long> entry : hMap.entrySet()) {
            if (entry.getValue() != 1) {
                countOfRepeated++;
            } else {
                countOfDistinct++;
            }
        }

        System.out.println(countOfRepeated + (countOfDistinct / 2));
    }
}
