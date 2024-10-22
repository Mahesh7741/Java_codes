import java.util.*;
public class FindExtraOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = 0, l = 0;
        for (long i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x > 0) {
                r++;
            } else {
                l++;
            }
        }
        if (Math.min(r, l) <= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
	}
}