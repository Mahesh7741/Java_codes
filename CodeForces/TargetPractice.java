import java.util.*;

public class TargetPractice {

    static int[][] scoreBoard = {
        {1,1,1,1,1,1,1,1,1,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,1,1,1,1,1,1,1,1,1}
    };

    public static void solve(Scanner sc) {
        int score = 0;

        for (int i = 0; i < 10; i++) {
            String row = sc.next();
            for (int j = 0; j < 10; j++) {
                if (row.charAt(j) == 'X') {
                    score += scoreBoard[i][j];
                }
            }
        }

        System.out.println(score);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
