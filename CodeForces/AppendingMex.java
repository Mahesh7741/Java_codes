import java.util.Scanner;

public class AppendingMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxElement = -1;
        int x;
        
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x > maxElement + 1) {
                System.out.println(i + 1);
                return;
            }
            maxElement = Math.max(maxElement, x);
        }
        
        System.out.println(-1);
    }
}
