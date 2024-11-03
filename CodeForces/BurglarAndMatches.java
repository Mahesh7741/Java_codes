import java.util.*;

public class BurglarAndMatches {
    public static long power(long a, int b) {
        long pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

    public static boolean isPrime(int n) {
        boolean ans = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair> arr = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.add(new Pair(a, b));
        }

        arr.sort((p1, p2) -> Integer.compare(p2.second, p1.second));
        
        int ans = 0;
        for (Pair pair : arr) {
            if (pair.first <= n && n > 0) {
                ans += pair.first * pair.second;
                n -= pair.first;
            } else if (n > 0) {
                ans += n * pair.second;
                n = 0;
            }
        }

        System.out.println(ans);
    }
}

class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
