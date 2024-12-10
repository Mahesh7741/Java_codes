import java.util.*;
public class OddSet{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long countOfEven = 0, countOfOdd = 0;
			for (int i = 0; i < 2 * n; i++) {
				long x = sc.nextLong();
				if ((x & 1) == 1) countOfOdd++;
				else countOfEven++;
			}
			if (countOfEven == countOfOdd) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
