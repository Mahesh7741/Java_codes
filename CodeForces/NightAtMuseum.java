import java.util.Scanner;
public class NightAtMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char start = 'a';
        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            long l1 = Math.abs(s.charAt(i) - start);
            long l2 = 26 - Math.abs(l1);
            sum += Math.min(l1, l2);
            start = s.charAt(i);
        }

        System.out.println(sum);
        scanner.close();
    }
}
