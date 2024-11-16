import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] count = new int[5];

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            count[s]++;
        }

        int total = count[4] + count[3] + count[2] / 2;
        count[1] -= count[3];

        if (count[2] % 2 == 1) {
            total += 1;
            count[1] -= 2;
        }

        if (count[1] > 0) {
            total += (count[1] + 3) / 4;
        }

        System.out.println(total);

        sc.close();
    }
}
