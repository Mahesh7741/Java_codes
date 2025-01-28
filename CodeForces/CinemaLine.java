import java.util.Scanner;

public class CinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int hand25 = 0, hand50 = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); 
            
            if (x == 25) {
                hand25++;
            } else if (x == 50) {
                hand50++;
                hand25--;
                if (hand25 < 0) {
                    System.out.println("NO");
                    return;
                }
            } else if (x == 100) {
                if (hand50 > 0) {
                    hand50--;
                    hand25--;
                } else {
                    hand25 -= 3;
                }
                if (hand25 < 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
