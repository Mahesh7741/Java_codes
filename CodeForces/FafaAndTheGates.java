import java.util.Scanner;

public class FafaAndTheGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            String str = sc.next();

            int x = 0, y = 0, coin = 0;

            for (int i = 0; i < n - 1; i++) {
                if (str.charAt(i) == 'U') {
                    y++;
                } else {
                    x++;
                }

                if (x == y && str.charAt(i) == str.charAt(i + 1)) {
                    coin++;
                }
            }

            System.out.println(coin);
        }

        sc.close();
    }
}
