import java.util.*;

public class RudolfAndTheAnotherCompetition {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();

            List<int[]> rank = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int[] p = new int[m];
                for (int i = 0; i < m; i++) {
                    p[i] = sc.nextInt();
                }
                Arrays.sort(p);
                int timeLeft = h, penalty = 0, totalTime = 0, polls = 0;

                for (int i = 0; i < m; i++) {
                    if (p[i] <= timeLeft) {
                        polls++;
                        penalty += totalTime + p[i];
                        totalTime += p[i];
                        timeLeft -= p[i];
                    } else {
                        break;
                    }
                }
                rank.add(new int[]{polls, penalty});
            }

            int rPolls = rank.get(0)[0];
            int rPenalty = rank.get(0)[1];
            int c = 0;

            for (int i = 1; i < n; i++) {
                if (rPolls < rank.get(i)[0]) {
                    c++;
                } else if (rPolls == rank.get(i)[0] && rPenalty > rank.get(i)[1]) {
                    c++;
                }
            }
            
            System.out.println((n == 1 || c == 0) ? 1 : (c + 1));
        }
    }
}
