import java.util.*;

public class WordOnthePaper {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        char[][] arr = new char[8][8];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            String line = sc.next(); 
            for (int j = 0; j < 8; j++) {
                arr[i][j] = line.charAt(j);
                if (arr[i][j] != '.') {
                    ans.append(arr[i][j]);
                }
            }
        }

        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
