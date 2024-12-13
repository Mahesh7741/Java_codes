import java.util.*;
public class ArithmeticArray{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long sumOfArr = 0;
			for (int i = 0; i < n; i++) {
				long temp = sc.nextLong();
				sumOfArr += temp;
			}
			if (sumOfArr == n) {
				System.out.println(0);
			} else if (sumOfArr < n) {
				System.out.println(1);
			} else {
				System.out.println(sumOfArr - n);
			}
		}
	}
}
