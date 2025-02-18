import java.util.Scanner;

public class BlankSpace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int ans = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    count++;
                } else {
                    ans = Math.max(count, ans);
                    count = 0;
                }
            }
            System.out.println(Math.max(count, ans));
        }

        sc.close();
    }
}
