import java.util.*;
public class PerfectTeam{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long t = sc.nextLong();
		while(t-- > 0) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z = sc.nextLong();
			long cnt = Math.min(x, y);
			long ans;
			if (cnt <= z) {
				ans = cnt;
			} else {
				ans = (x + y + z) / 3;
				if (ans > cnt) {
					ans = cnt;
				}
			}
			System.out.println(ans);
		}
	}
}
