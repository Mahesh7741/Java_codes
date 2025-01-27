import java.util.Scanner;

public class PashaAndHamsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] v = new int[n + 1];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            v[x] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (v[i] == 0)
                System.out.print(2 + " ");
            else
                System.out.print(1 + " ");
        }

        sc.close();
    }
}
