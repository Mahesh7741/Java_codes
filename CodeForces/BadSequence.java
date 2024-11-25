import java.util.*;
public class BadSequence{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long n = sc.nextLong();
		String s = sc.next();
		int flag = 0;
		Stack<Character> st = new Stack<>();
		for(long i = 0; i < n; i++) {
			if(s.charAt((int)i) == '(') {
				st.push(s.charAt((int)i));
			} else {
				if(!st.isEmpty() && st.peek() == '(') {
					st.pop();
				} else {
					st.push(s.charAt((int)i));
				}
			}
			if(!st.isEmpty() && st.peek() == ')' && flag == 0) {
				st.pop();
				flag = 1;
			}
		}
		if(flag == 0 && st.isEmpty()) {
			System.out.println("YES");
		} else if(flag == 1 && st.size() == 1 && st.peek() == '(') {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
