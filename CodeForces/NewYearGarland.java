import java.util.*;

public class NewYearGarland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long[] a = new long[3];
            a[0] = sc.nextLong();
            a[1] = sc.nextLong();
            a[2] = sc.nextLong();
            
            Arrays.sort(a);
            
            if (a[0] + a[1] < a[2] - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        
        sc.close();
    }
}
