import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long result = (n - 1) * n * (n + 1) / 6 + n;
        
        System.out.println(result);
    }
}
