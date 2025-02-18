import java.util.Scanner;

public class LoveStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String c = "codeforces";
            int count = 0;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != c.charAt(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
