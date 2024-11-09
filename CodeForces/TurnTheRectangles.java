import java.util.Scanner;

public class TurnTheRectangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int k = Math.max(a, b);
            boolean B = true;

            for (int i = 2; i <= n; i++) {
                a = sc.nextInt();
                b = sc.nextInt();

                int maxi = Math.max(a, b);
                int mini = Math.min(a, b);

                if (B) {
                    if (maxi <= k) {
                        k = maxi;
                    } else if (mini <= k) {
                        k = mini;
                    } else {
                        B = false;
                    }
                }
            }

            if (!B) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
