import java.util.*;
public class Scuza{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long q = sc.nextLong();
			long[] arr = new long[(int)n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			long[] preSum = new long[(int)n];
			long[] preGreater = new long[(int)n];
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					preSum[i] = arr[i];
					preGreater[i] = arr[i];
				} else {
					preSum[i] = preSum[i - 1] + arr[i];
					preGreater[i] = Math.max(preGreater[i - 1], arr[i]);
				}
			}
			while (q-- > 0) {
				long k = sc.nextLong();
				int low = 0, high = (int)n - 1, pos = -1;
				while (low <= high) {
					int mid = low + (high - low) / 2;
					if (preGreater[mid] <= k) {
						pos = mid;
						low = mid + 1;
					} else {
						high = mid - 1;
					}
				}
				if (pos == -1) {
					System.out.print("0 ");
				} else {
					System.out.print(preSum[pos] + " ");
				}
			}
			System.out.println();
		}
	}
}
