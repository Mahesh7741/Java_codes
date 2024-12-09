import java.util.*;
public class FairDivision{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long count1 = 0, count2 = 0;
			for (int i = 0; i < n; i++) {
				long temp = sc.nextLong();
				if (temp == 1) count1++;
				else count2++;
			}
			if ((count1 + 2 * count2) % 2 != 0) {
				System.out.println("No");
			} else {
				long sum = (count1 + 2 * count2) / 2;
				if (sum % 2 == 0 || (sum % 2 == 1 && count1 != 0)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
