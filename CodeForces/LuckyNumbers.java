import java.util.*;
public class LuckyNumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        System.out.println(f(n));
    }

    static long f(long n) {
        return (long) Math.pow(2, n + 1) - 2;
    }
}
