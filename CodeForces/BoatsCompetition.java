import java.util.*;
public class BoatsCompetition {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxTeams = 0;
            for (int s = 2; s <= 2 * n; s++) {
                boolean[] used = new boolean[n];
                int teams = 0;
                for (int i = 0; i < n; i++) {
                    if (used[i]) continue;
                    for (int j = i + 1; j < n; j++) {
                        if (!used[j] && a[i] + a[j] == s) {
                            used[i] = used[j] = true;
                            teams++;
                            break;
                        }
                    }
                }
                maxTeams = Math.max(maxTeams, teams);
            }
            System.out.println(maxTeams);
        }
    }
}
