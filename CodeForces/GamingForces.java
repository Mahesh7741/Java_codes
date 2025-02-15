import java.util.*;

class GamingForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), num1 = 0, h;
            for (int i = 0; i < n; i++) {
                h = sc.nextInt();
                if (h == 1)
                    num1++;
            }
            System.out.println(n - (num1 / 2));
        }
    }
}
