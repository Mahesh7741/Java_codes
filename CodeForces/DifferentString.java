import java.util.*;

public class DifferentString {
    static Scanner sc = new Scanner(System.in);

    static void solve() {
        String s = sc.next();
        char[] arr = s.toCharArray();
        boolean ok = false;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[0]) {
                // Swap characters
                char temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                ok = true;
                break;
            }
        }

        if (ok) {
            System.out.println("YES");
            System.out.println(new String(arr));
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int TCS = sc.nextInt();
        while (TCS-- > 0) {
            solve();
        }
    }
}
