import java.util.*;

public class Army {
    public static int army(int[] d, int a, int b) {
        int sum = 0;
        for (int i = a - 1; i < b - 1; i++) {
            sum += d[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            d[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = army(d, a, b);
        System.out.println(result);
        sc.close();
    }
}
