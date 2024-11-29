import java.util.*;
public class SocialDistance {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			int i = 0, j = 0, cnt = 0, ans = 0;
			boolean one = false;

			while (i < n && j < n) {
				if (s.charAt(j) == '1') {
					if (!one)
						ans += (cnt / (k + 1));
					else
						ans += ((cnt - k) / (k + 1));
					i = j;
					cnt = 0;
					one = true;
				} else if (s.charAt(j) == '0') {
					cnt++;
				}
				j++;
			}

			if (!one)
				ans += ((cnt - 1) / (k + 1)) + 1;
			else
				ans += (cnt / (k + 1));
			System.out.println(ans);
		}
	}
}
