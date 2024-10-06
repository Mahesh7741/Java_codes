import java.util.*;

public class TriangularNumbers {
    public static boolean triangularNumber(int n) {
        double k = (-1 + Math.sqrt(1 + 8 * n)) / 2;
        return k == Math.floor(k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (triangularNumber(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
