import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MahmoudAndTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            ArrayList<Integer> v = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                v.add(x);
            }

            Collections.sort(v);
            boolean check = false;

            for (int j = 0; j < n - 2; j++) {
                int a = v.get(j);
                int b = v.get(j + 1);
                int c = v.get(j + 2);

                if (a + b > c && b + c > a && c + a > b) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
            }

            if (!check) {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
