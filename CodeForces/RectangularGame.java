import java.util.Scanner;

public class RectangularGame {

    public static long posibles(long n) {
        long hasta = n >> 1;
        for (long i = 2; i <= hasta; ++i) {
            if (n % i == 0)
                return i;
        }
        return n;
    }

    public static long maxDivided(long n, long tempMax) {
        if (n == 1) return tempMax;
        long menor = posibles(n);
        long nuevo = n / menor;
        tempMax += nuevo;
        return maxDivided(nuevo, tempMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long maxResp = n + 1;
        long menor = posibles(n);
        long tempMax = 0;
        long nuevo = n / menor;
        tempMax = n + nuevo;
        maxResp = Math.max(maxResp, maxDivided(nuevo, tempMax));
        System.out.println(maxResp);
    }
}
