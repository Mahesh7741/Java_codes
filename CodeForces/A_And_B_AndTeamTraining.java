import java.util.*;
public class A_And_B_AndTeamTraining {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = 0;

		while (n > 0 && m > 0) {
			if (n == 1 && m == 1)
				break;
			if (n < m) {
				n--;
				m -= 2;
			} else {
				n -= 2;
				m--;
			}
			t++;
		}

		System.out.println(t);
	}
}
