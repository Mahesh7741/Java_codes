import java.util.Scanner;

public class BuggyRobot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            char direction = s.charAt(i);
            if (direction == 'U') {
                ++y;
            } else if (direction == 'D') {
                --y;
            } else if (direction == 'L') {
                --x;
            } else if (direction == 'R') {
                ++x;
            }
        }

        int val1 = Math.abs(x) + Math.abs(y);
        System.out.println(n - val1);

        sc.close();
    }
}
