import java.util.*;
public class C_Plus{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long sum = 0, count = 0;
            
            while (sum <= n) {
                if (a > b) {
                    b += a;
                    sum = b;
                } else {
                    a += b;
                    sum = a;
                }
                count++;
                if (sum > n) break;
            }
            System.out.println(count);
        }
    }
}
