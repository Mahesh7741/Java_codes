import java.util.*;

public class MakeGood {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0, xor = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
                xor ^= arr[i];
            }
            
            if (sum == 2 * xor) {
                System.out.println(0);
            } else {
                System.out.println(1);
                System.out.println(xor);
            }
        }
    }
}
