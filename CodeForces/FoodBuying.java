import java.util.Scanner;

public class FoodBuying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long ans = n;
            long div;
            
            if (n < 10) {
                System.out.println(n);
                continue;
            } else {
                while (n >= 10) {
                    div = n / 10;
                    n = n % 10 + div;
                    ans += div;
                }
                System.out.println(ans);
            }
        }
        
        scanner.close();
    }
}
