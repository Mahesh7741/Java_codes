import java.util.*;

public class EhabAndAnotherConstructionProblem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j > n && i % j == 0 && i / j < n) {
                    System.out.println(i + " " + j);
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("-1");
        sc.close();
    }
}
