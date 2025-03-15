import java.util.*;

public class LOLLovers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = 1;
        // TC = sc.nextInt(); // Uncomment if multiple test cases are needed
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();

        int ctL = 0, ctO = 0, netL = 0, netO = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') netL++;
            else netO++;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'L') ctL++;
            else ctO++;

            if (ctL != netL - ctL && ctO != netO - ctO) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(-1);
    }
}
