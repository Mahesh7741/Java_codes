import java.util.*;

public class TaymyrIsCallingYou{
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int z = sc.nextInt();
        int lcm = lcm(n, m);
        int cnt = 0;
        for (int i = lcm; i <= z; i += lcm) {
            cnt++;
        }   
        System.out.println(cnt);
        sc.close();
    }
}
