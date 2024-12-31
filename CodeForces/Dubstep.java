import java.util.*;
public class Dubstep {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        boolean flag = true;

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i) == 'W' && s.charAt(i + 1) == 'U' && s.charAt(i + 2) == 'B') {
                i += 2;
                if (!flag) System.out.print(" ");
                continue;
            } else {
                flag = false;
                System.out.print(s.charAt(i));
            }
        }
    }
}
