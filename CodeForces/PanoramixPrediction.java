import java.util.Scanner;

public class PanoramixPrediction {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt();  
        int nextPrime = -1;
        for (int i = n + 1; ; i++) {
            if (isPrime(i)) {
                nextPrime = i;
                break;
            }
        }
        
        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
