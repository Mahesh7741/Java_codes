import java.util.*;
public class MereArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int mn = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				mn = Math.min(a[i], mn);
			}

			int[] b = Arrays.copyOf(a, n);
			Arrays.sort(a);

			boolean possible = true;
			for (int i = 0; i < n; i++) {
				if (a[i] != b[i] && a[i] % mn != 0) {
					possible = false;
					break;
				}
			}

			System.out.println(possible ? "YES" : "NO");
		}
	}
}
