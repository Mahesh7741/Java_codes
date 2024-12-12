import java.util.*;
public class ArrayColoring{ 
	static Scanner sc=new Scanner(System.in);
	public static String solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		if (sum % 2 != 0) {
			return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println(solve());
		}
	}
}
