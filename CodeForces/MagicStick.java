import java.util.Scanner;

public class MagicStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            if (x == 1 && y > 1) {
                System.out.println("NO");
            } else {
                if (x <= 3 && y > 3) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        
        sc.close();
    }
}
