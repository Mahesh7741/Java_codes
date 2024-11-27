import java.util.*;
public class ThreePartsOfTheArray{ 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int[] nums = new int[n];
		long[] pre = new long[n + 1];
		long[] suf = new long[n + 1];
		long ans = 0;
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		pre[0] = 0;
		suf[n] = 0;
		
		for(int i = 0; i < n; i++) {
			pre[i + 1] = pre[i] + nums[i];
		}
		for(int i = n - 1; i >= 0; i--) {
			suf[i] = suf[i + 1] + nums[i];
		}
		
		int ind = 0, ind2 = n;
		while(ind <= ind2) {
			if(pre[ind] == suf[ind2]) {
				ans = pre[ind];
				ind++;
				ind2--;
			}
			while(ind <= ind2 && pre[ind] < suf[ind2]) ind++;
			while(ind <= ind2 && pre[ind] > suf[ind2]) ind2--;
		}
		
		System.out.println(ans);
	}
}
