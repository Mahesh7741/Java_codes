import java.util.Scanner;

public class Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        boolean[] arr = new boolean[m];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); 
            for (int j = 0; j < x; j++) {
                int y = sc.nextInt();
                arr[y - 1] = true; 
            }
        }
        for (int i = 0; i < m; i++) {
            if (!arr[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
