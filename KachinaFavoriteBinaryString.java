import java.util.*;

public class KachinaFavoriteBinaryString {
    static Scanner sc = new Scanner(System.in);

    private static int query(int l, int r) {
        System.out.println("? " + l + " " + r);
        System.out.flush();
        return sc.nextInt();
    }

    private static void solve() {
        int n = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        int previousSubsequences = 0;
        int countZeroes = 0;

        for (int i = 1; i < n; i++) {
            int subsequences = query(1, i + 1);

            if (previousSubsequences == 0) {
                if (subsequences == 0) {
                    continue;
                } else {
                    if (subsequences > i) {
                        System.out.println("! IMPOSSIBLE");
                        return;
                    } else {
                        for (int j = 0; j < i - subsequences; j++) {
                            answer.append('1');
                        }
                        for (int j = 0; j < subsequences; j++) {
                            answer.append('0');
                        }
                    }
                }
                answer.append('1');
                countZeroes = subsequences;
                previousSubsequences = subsequences;
            } else {
                if (subsequences > previousSubsequences) {
                    if (subsequences - previousSubsequences == countZeroes) {
                        answer.append('1');
                        previousSubsequences = subsequences;
                    } else {
                        System.out.println("! IMPOSSIBLE");
                        return;
                    }
                } else if (subsequences == previousSubsequences) {
                    answer.append('0');
                    countZeroes++;
                } else {
                    System.out.println("! IMPOSSIBLE");
                    return;
                }
            }
        }

        if (answer.length() < n) {
            System.out.println("! IMPOSSIBLE");
            return;
        }

        System.out.println("! " + answer);
        System.out.flush();
    }

    public static void main(String[] args) {
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            solve();
        }
    }
}
