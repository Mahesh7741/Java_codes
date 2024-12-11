import java.util.*;
public class NumberofPairs{ 
	static Scanner sc=new Scanner(System.in);

	static long getPairs(long n, long[] arr, long k) {
		long count = 0;
		int low = 0, high = (int)n - 1;
		while (low < high) {
			while (low < high && arr[low] + arr[high] > k) high--;
			count += (high - low);
			low++;
		}
		return count;
	}

	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long l = sc.nextLong();
			long r = sc.nextLong();
			long[] arr = new long[(int)n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			System.out.println(getPairs(n, arr, r) - getPairs(n, arr, l - 1));
		}
	}
}
