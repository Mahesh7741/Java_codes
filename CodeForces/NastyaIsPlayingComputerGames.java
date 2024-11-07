import java.util.Scanner;

public class NastyaIsPlayingComputerGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (k == n || k == 1) {
            System.out.println(3 * n);
        } else {
            System.out.println((3 * n) + Math.min(Math.abs(k - 1), Math.abs(n - k)));
        }
        
        sc.close();
    }
}
