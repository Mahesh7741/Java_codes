import java.util.Scanner;
import java.util.Vector;

public class Pillars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vector<Integer> v = new Vector<>(n);

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }

        boolean flag = true;
        for (int i = 1; i < n - 1; i++) {
            if (v.get(i - 1) >= v.get(i) && v.get(i) <= v.get(i + 1)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");

        sc.close();
    }
}
