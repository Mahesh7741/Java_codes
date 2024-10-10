import java.util.*;

public class PolandBallAndHypothesis {
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int isNotPrime(int n) {
        for (int i = 1; i <= 1000; i++) {  
            int num = (n * i) + 1;
            if (!checkPrime(num)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = isNotPrime(n);
        System.out.println(result);
        sc.close();
    }
}
