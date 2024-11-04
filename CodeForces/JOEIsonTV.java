import java.util.Scanner;

public class JOEIsonTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double m = n;
        double ans = 0.0;
        
        for (int i = 0; i < n; i++) {
            ans += 1 / m;
            m--;
        }
        
        System.out.printf("%.12f%n", ans);
        
        sc.close();
    }
}
