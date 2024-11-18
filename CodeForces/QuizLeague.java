import java.util.*;

public class QuizLeague {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[k - 1] == 1) {
            System.out.println(k);
            return;
        }

        while (true) {
            k = (k % n) + 1;
            if (arr[k - 1] == 1) {
                System.out.println(k);
                return;
            }
        }
    }
}
