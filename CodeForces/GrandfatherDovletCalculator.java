import java.util.Scanner;

public class GrandfatherDovletCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int[] seg = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        long sum = 0;

        for (int i = a; i <= b; i++) {
            int k = i;
            while (k > 0) {
                int r = k % 10;
                k /= 10;
                sum += seg[r];
            }
        }
        
        System.out.printf("%d", sum);
    }
}
