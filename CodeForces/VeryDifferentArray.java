import java.util.*;

public class VeryDifferentArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        reverseArray(b); 

        int al = 0, bl = 0, ar = n - 1, br = m - 1;
        long sum = 0;

        while (al <= ar) {
            int x = Math.abs(a[al] - b[bl]);
            int y = Math.abs(a[ar] - b[br]);
            sum += Math.max(x, y);

            if (x > y) {
                al++;
                bl++;
            } else {
                ar--;
                br--;
            }
        }

        System.out.println(sum);
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
