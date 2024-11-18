import java.util.*;

public class GCDCompression {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[2 * n];
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for (int i = 0; i < 2 * n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    even.add(i + 1);
                } else {
                    odd.add(i + 1);
                }
            }

            List<int[]> ans = new ArrayList<>();
            for (int i = 0; i + 1 < even.size(); i += 2) {
                ans.add(new int[]{even.get(i), even.get(i + 1)});
            }
            for (int i = 0; i + 1 < odd.size(); i += 2) {
                ans.add(new int[]{odd.get(i), odd.get(i + 1)});
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.println(ans.get(i)[0] + " " + ans.get(i)[1]);
            }
        }
    }
}
