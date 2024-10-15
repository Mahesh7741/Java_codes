import java.util.Scanner;

public class LittleArtemAndPresents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long stones, gift;

        while (sc.hasNextLong()) {
            stones = sc.nextLong();
            gift = 2 * (stones / 3);

            if (stones % 3 > 0) {
                gift++;
            }

            System.out.println(gift);
        }

        sc.close();
    }
}
