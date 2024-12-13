import java.util.*;
public class MakeEven{ 
	static Scanner sc=new Scanner(System.in);
	
	public static int solve(int n) {
		if (n % 2 == 0) {
			return 0;
		}
		String s = Integer.toString(n);
		boolean ok = false;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) - '0') % 2 == 0) {
				ok = true;
				break;
			}
		}
		if (!ok) {
			return -1;
		} else {
			if ((s.charAt(0) - '0') % 2 == 0) {
				return 1;
			} else {
				return 2;
			}
		}
	}
	
	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(solve(n));
		}
	}
}
