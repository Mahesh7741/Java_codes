import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] friendGaveGift = new int[n];

        for (int i = 0; i < n; i++) {
            friendGaveGift[i] = sc.nextInt();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[friendGaveGift[i] - 1] = i + 1; 
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
