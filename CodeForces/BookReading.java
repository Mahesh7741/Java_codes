import java.util.*;
public class  BookReading{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			solve();
		}
	}

	static void solve() {
		long n = sc.nextLong();
		long m = sc.nextLong();
		long firstten = 0;
		for(long cnt = 1, i = m; cnt <= 10 && i <= n; cnt++, i += m) {
			firstten += i % 10;
		}
		long ans = firstten * Math.max(0, n / (m * 10));
		n %= m * 10;
		for(long i = m; i <= n; i += m) {
			ans += i % 10;
		}
		System.out.println(ans);
	}
}
