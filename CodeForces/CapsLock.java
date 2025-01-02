import java.util.*;
public class CapsLock {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();

        boolean allCaps = true;

        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                allCaps = false;
                break;
            }
        }

        if (!Character.isUpperCase(s.charAt(0)) && allCaps) {
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            System.out.println(s);
        } else if (Character.isUpperCase(s.charAt(0)) && allCaps) {
            s = s.toLowerCase();
            System.out.println(s);
        } else {
            System.out.println(s);
        }
    }
}
