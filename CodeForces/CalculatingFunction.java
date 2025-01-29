import java.util.Scanner;

public class CalculatingFunction {

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        long n, sum = 0;
        n = sc.nextLong();
        
        if (n % 2 == 0) 
            sum = n / 2;
        else 
            sum = -(n / 2 + 1);
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;
        
        while (TC-- > 0) {
            solve();
        }
    }
}
