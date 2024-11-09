import java.util.Scanner;

public class Set {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long k = scanner.nextLong();
            if (k == 0) {
                System.out.println(0);
                continue;
            }
            long m = r / k;
            if (m >= l) {
                System.out.println(m - l + 1);
            } else {
                System.out.println(0);
            }
        }
        
        scanner.close();
    }
}
