import java.util.Scanner;

public class Chocolates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long[] arr = new long[(int) num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLong();
        }

        long ans = arr[(int) num - 1];
        long now = ans;

        for (int i = (int) num - 2; i >= 0; i--) {
            if (arr[i] < now) {
                ans += arr[i];
                now = arr[i];
            } else {
                ans += Math.max(0, now - 1);
                now--;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
