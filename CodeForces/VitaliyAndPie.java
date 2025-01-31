import java.util.HashMap;
import java.util.Scanner;

public class VitaliyAndPie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        HashMap<Character, Integer> m = new HashMap<>();
        int ct = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLowerCase(c)) {
                m.put(c, m.getOrDefault(c, 0) + 1);
            } else {
                c = Character.toLowerCase(c);
                if (m.getOrDefault(c, 0) > 0) {
                    m.put(c, m.get(c) - 1);
                } else {
                    ct++;
                }
            }
        }
        
        System.out.println(ct);
    }
}
