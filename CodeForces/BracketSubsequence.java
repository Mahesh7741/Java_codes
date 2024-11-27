import java.util.*;
public class BracketSubsequence{ 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		char[] r = new char[k];
		
		int openNeeded = k / 2, closeNeeded = openNeeded, balance = 0;
		int j = 0;
		
		for(int i = 0; i < n; ++i) {
			if(s.charAt(i) == '(') {
				if(openNeeded > 0) {
					r[j++] = '(';
					++balance;
					--openNeeded;
				}
			} else {
				if(closeNeeded > 0 && balance > 0) {
					r[j++] = ')';
					--balance;
					--closeNeeded;
				}
			}
			if(j == k) break; 
		}
		
		System.out.println(new String(r));
	}
}
