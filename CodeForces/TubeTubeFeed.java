import java.util.*;
public class TubeTubeFeed{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			long[] arr = new long[(int)n];
			long[] brr = new long[(int)n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {
				brr[i] = sc.nextLong();
			}
			int best = -2;
			for (int i = 0; i < n; i++) {
				if (i + arr[i] <= k && (best == -2 || brr[best] < brr[i])) {
					best = i;
				}
			}
			System.out.println(best + 1);
		}
	}
}
