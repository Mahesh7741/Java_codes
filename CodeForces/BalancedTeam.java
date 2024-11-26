import java.util.*;
public class BalancedTeam{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long n = sc.nextLong();
		long[] a = new long[(int)n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		int j = 0;
		long ans = 0;
		for(int i = 0; i < n; i++) {
			while(j < n && a[j] <= a[i] + 5) {
				j++;
				ans = Math.max(ans, j - i);
			}
		}
		System.out.println(ans);
	}
}
