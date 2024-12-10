import java.util.*;
public class BeatTheOdds{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long odd = 0, even = 0;
			for (int i = 0; i < n; i++) {
				long t = sc.nextLong();
				if ((t & 1) == 1) odd++;
				else even++;
			}
			System.out.println(Math.min(odd, even));
		}
	}
}
