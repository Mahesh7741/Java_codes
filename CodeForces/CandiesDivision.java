import java.util.Scanner;

public class  CandiesDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n % k == 0) {
                System.out.println(n);
            } else {
                long a = (n / k) * k;
                System.out.println(Math.min(n, a + k / 2));
            }
        }
        
        sc.close();
    }
}
