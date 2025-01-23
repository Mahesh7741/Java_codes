import java.util.*;
public class IncreasingSequence{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int d = sc.nextInt();
		int b0 = sc.nextInt();
		int moves = 0;
		for(int i = 1; i < n; i++) {
			int b = sc.nextInt();
			if(b <= b0) {
				int x = (b0 - b) / d + 1;
				moves += x;
				b0 = b + x * d;
			} else {
				b0 = b;
			}
		}
		System.out.println(moves);
	}
}
