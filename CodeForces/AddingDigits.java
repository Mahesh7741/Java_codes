import java.util.Scanner;

public class AddingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        boolean exist = false;

        for (int i = 0; i < 10; i++) {
            int candidate = a * 10 + i;
            if (candidate % b == 0) {
                System.out.print(candidate);
                for (int j = 0; j < n - 1; j++) {
                    System.out.print("0");
                }
                System.out.println();
                exist = true;
                break;
            }
        }

        if (!exist) {
            System.out.println("-1");
        }

        sc.close();
    }
}
