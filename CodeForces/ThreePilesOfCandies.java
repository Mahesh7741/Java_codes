import java.util.*;

public class ThreePilesOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long ans = (x + y + z) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}
