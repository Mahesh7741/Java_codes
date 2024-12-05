import java.util.*;
public class LineBreaks {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long t = sc.nextLong();
		sc.nextLine();
		while (t-- > 0) {
			solve();
		}
		sc.close();
	}
	public static void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int countString = 0;
		int totalStringLenSum = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			totalStringLenSum += s.length();
			if (totalStringLenSum <= m) {
				countString++;
			}
		}
		System.out.println(countString);
	}
}
