import java.util.*;

public class PresidentOffice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char pc = sc.next().charAt(0);

            char[][] s = new char[n][m];
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    s[i][j] = row.charAt(j);
                }
            }

            int cnt = 0;
            boolean[] mark = new boolean[256];
            mark[pc] = true;
            mark['.'] = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (s[i][j] == pc) {
                        if (j + 1 < m && !mark[s[i][j + 1]]) {
                            cnt++;
                            mark[s[i][j + 1]] = true;
                        }
                        if (j - 1 >= 0 && !mark[s[i][j - 1]]) {
                            cnt++;
                            mark[s[i][j - 1]] = true;
                        }
                        if (i + 1 < n && !mark[s[i + 1][j]]) {
                            cnt++;
                            mark[s[i + 1][j]] = true;
                        }
                        if (i - 1 >= 0 && !mark[s[i - 1][j]]) {
                            cnt++;
                            mark[s[i - 1][j]] = true;
                        }
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
