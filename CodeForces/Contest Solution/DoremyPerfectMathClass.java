import java.util.*;
public class DoremyPerfectMathClass{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int g = 0, ma = 0;
			while(n-- > 0){
				int x = sc.nextInt();
				ma = Math.max(ma, x);
				g = gcd(g, x);
			}
			System.out.println(ma / g);
		}
	}
	static int gcd(int a, int b){
		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
