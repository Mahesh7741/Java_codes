import java.util.Scanner;

public class ValuedKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder s3 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                s3.append(s1.charAt(i));
            } else if (s1.charAt(i) > s2.charAt(i)) {
                s3.append((char) Math.min(s1.charAt(i), s2.charAt(i)));
            } else {
                System.out.println("-1");
                sc.close();
                return;
            }
        }

        System.out.println(s3.toString());
        sc.close();
    }
}
