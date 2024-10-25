import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0, ans = 0.0;
        for (int i = 0; i < n; i++) {
			double value=sc.nextDouble();
            sum += value;
        }
        ans = sum / n;
        System.out.printf("%.12f%n", ans);
        
        sc.close();
    }
}
