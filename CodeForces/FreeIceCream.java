import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        
        int distressedKids = 0;
        
        for (int i = 0; i < n; i++) {
            String operation = scanner.next();
            long di = scanner.nextLong();
            
            if (operation.equals("+")) {
                x += di;
            } else {
                if (di <= x) {
                    x -= di;
                } else {
                    distressedKids++;
                }
            }
        }
        
        System.out.println(x + " " + distressedKids);
        
        scanner.close();
    }
}
