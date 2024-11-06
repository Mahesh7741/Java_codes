import java.util.Scanner;

public class WaterLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double H = sc.nextDouble();
        double L = sc.nextDouble();

        System.out.printf("%.10f%n", ((L * L - H * H) / (2 * H)));

        sc.close();
    }
}
