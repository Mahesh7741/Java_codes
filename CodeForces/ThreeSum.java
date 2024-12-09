import java.util.*;
public class ThreeSum{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long[] count = new long[10];
			for (int i = 0; i < n; i++) {
				long temp = sc.nextLong();
				count[(int)(temp % 10)]++;
			}
			List<Long> newArr = new ArrayList<>();
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < Math.min(count[i], 3); j++) {
					newArr.add((long)i);
				}
			}
			int N = newArr.size();
			boolean found = false;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					for (int k = j + 1; k < N; k++) {
						long sum = newArr.get(i) + newArr.get(j) + newArr.get(k);
						if (sum % 10 == 3) {
							System.out.println("YES");
							found = true;
							break;
						}
					}
					if (found) break;
				}
				if (found) break;
			}
			if (!found) {
				System.out.println("NO");
			}
		}
	}
}
