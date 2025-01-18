import java.util.*;

public class GregWorkout {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] count = new long[3];

        for (int i = 0; i < n; i++) {
            count[i % 3] += arr[i];
        }

        if (count[0] > count[1] && count[0] > count[2])
            System.out.println("chest");
        else if (count[1] > count[0] && count[1] > count[2])
            System.out.println("biceps");
        else
            System.out.println("back");
    }

    public static void main(String[] args) {
        solve();
    }
}
