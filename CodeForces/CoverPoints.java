import java.util.*;
public class CoverPoints{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
        while (sc.hasNextLong()) {
            long n = sc.nextLong();
            long ans = 0;

            for (long pos = 1; pos <= n; pos++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                ans = Math.max(ans, a + b);
            }

            System.out.println(ans);
        }

        sc.close();
	}
}