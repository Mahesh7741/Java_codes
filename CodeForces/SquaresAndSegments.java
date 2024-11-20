import java.util.*;

public class SquaresAndSegments {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(findAns(n));
    }

    static int findAns(int n) {
        for (int i = 2;; i++) {
            int x = (i / 2) * (i / 2 + (i & 1));
            if (x >= n) {
                n = i;
                break;
            }
        }
        return n;
    }
}
