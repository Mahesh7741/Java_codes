import java.util.Scanner;

public class CanvasFrames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[101];

        while (n-- > 0) {
            int a = sc.nextInt();
            count[a]++;
        }

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += count[i] / 2;
        }

        System.out.println(total / 2);
    }
}
