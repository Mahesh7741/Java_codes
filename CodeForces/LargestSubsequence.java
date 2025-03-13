import java.util.*;

public class LargestSubsequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {
        int n = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();

        List<Pair> largest = new ArrayList<>(); // char, position
        boolean[] taken = new boolean[n];

        for (int i = 0; i < n; i++) {
            while (!largest.isEmpty() && largest.get(largest.size() - 1).ch < chars[i]) {
                largest.remove(largest.size() - 1);
            }
            largest.add(new Pair(chars[i], i));
        }

        int same = 1;
        for (int i = 0; i + 1 < largest.size(); i++) {
            if (largest.get(0).ch == largest.get(i + 1).ch) {
                same++;
            }
        }

        Collections.reverse(largest);
        for (int i = 0; i < largest.size(); i++) {
            chars[largest.get(largest.size() - 1 - i).pos] = largest.get(i).ch;
        }

        if (isSorted(chars)) {
            System.out.println(largest.size() - same);
        } else {
            System.out.println(-1);
        }
    }

    static boolean isSorted(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static class Pair {
        char ch;
        int pos;

        Pair(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }
}
