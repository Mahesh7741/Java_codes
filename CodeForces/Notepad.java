import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Notepad {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        String s = sc.next();
        
        Map<String, Long> hMap = new HashMap<>();
        boolean flag = false;

        for (int i = 0; i < n - 1; i++) {
            String temp = s.substring(i, i + 2);
            if (hMap.containsKey(temp) && hMap.get(temp) < i - 1) {
                flag = true;
                break;
            } else if (!hMap.containsKey(temp)) {
                hMap.put(temp, (long) i);
            }
        }

        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
