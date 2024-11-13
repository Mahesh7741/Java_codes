import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Map<String, String> t = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();
            t.put(a, b);
        }
        
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            String y = t.get(x);
            
            if (y.length() < x.length()) {
                System.out.print(y + " ");
            } else {
                System.out.print(x + " ");
            }
        }
        
        sc.close();
    }
}
