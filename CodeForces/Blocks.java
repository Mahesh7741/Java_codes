import java.util.*;

public class Blocks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();

        if (check(s, 'W', 'B')) {
            return;
        } else if (check(s, 'B', 'W')) {
            return;
        } else {
            System.out.println(-1);
        }
    }

    static boolean check(String s, char c, char alt) {
        List<Integer> flips = new ArrayList<>();
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != c) {
                arr[i] = c;
                arr[i + 1] = (arr[i + 1] == alt ? c : alt);
                flips.add(i + 1);
            }
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                return false;
            }
        }

        System.out.println(flips.size());
        for (int x : flips) {
            System.out.print(x + " ");
        }
        System.out.println();
        return true;
    }
}
