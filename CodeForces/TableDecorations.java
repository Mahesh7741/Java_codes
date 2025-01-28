import java.util.*;

public class TableDecorations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] a = new long[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long ans = Math.min(a[0] + a[1], (a[0] + a[1] + a[2]) / 3);

        System.out.println(ans);
    }
}
