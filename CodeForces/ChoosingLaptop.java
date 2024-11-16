import java.util.Scanner;
import java.util.Arrays;

public class ChoosingLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] speed = new int[n + 1];
        int[] ram = new int[n + 1];
        int[] hdd = new int[n + 1];
        int[] cost = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            speed[i] = sc.nextInt();
            ram[i] = sc.nextInt();
            hdd[i] = sc.nextInt();
            cost[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (speed[i] < speed[j] && ram[i] < ram[j] && hdd[i] < hdd[j]) {
                    cost[i] = 1001; 
                }
            }
        }
        int minIndex = 1;
        for (int i = 2; i <= n; i++) {
            if (cost[i] < cost[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println(minIndex);

        sc.close();
    }
}
