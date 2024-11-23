import java.util.*;

public class ShohagLovesStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
            String s = sc.nextLine();
            int len = s.length();
            String result = "-1"; 
            for (int i = 0; i < len - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    result = s.substring(i, i + 2);
                    break;
                }
            }
            if (result.equals("-1") && len > 1) {
                result = s.substring(0, 2);
            }
            System.out.println(result);
        }
    }
}
