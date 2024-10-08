import java.util.*;

public class Reconnaissance2 {
    public static int[] reconnaissance(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        int[] idx = new int[2];
        int value;

        for (int i = 1; i < n; i++) {
            value = Math.abs(arr[i] - arr[i - 1]);
            if (value < min) {
                idx[0] = i;
                idx[1] = i + 1;
                min = value;
            }
        }
        value = Math.abs(arr[n - 1] - arr[0]);
        if (value < min) {
            idx[0] = n;
            idx[1] = 1;
        }

        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] result = reconnaissance(a, n);
        System.out.println(result[0] + " " + result[1]);
        sc.close();
    }
}
