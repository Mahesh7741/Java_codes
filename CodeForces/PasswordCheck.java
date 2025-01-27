import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        boolean flag1 = false, flag2 = false, flag3 = false;

        if (s.length() >= 5) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isUpperCase(ch)) {
                    flag1 = true;
                } else if (Character.isLowerCase(ch)) {
                    flag2 = true;
                } else if (Character.isDigit(ch)) {
                    flag3 = true;
                }
                if (flag1 && flag2 && flag3) {
                    break;
                }
            }
        }

        if (s.length() > 4 && flag1 && flag2 && flag3) {
            System.out.println("Correct");
        } else {
            System.out.println("Too weak");
        }
    }
}
