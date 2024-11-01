import java.util.Scanner;

public class MargariteAndTheBestPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for (int i = 1; i <= q; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            x--; 
            long a = (x % 2 == 1) ? -(x + 1) / 2 : x / 2;
            long b = (y % 2 == 1) ? -(y + 1) / 2 : y / 2;

            System.out.println(b - a);
        }
        
        sc.close();
    }
}
