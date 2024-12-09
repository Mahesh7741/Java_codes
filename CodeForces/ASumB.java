import java.util.*;
public class ASumB{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int t = sc.nextInt();
		while (t-- > 0) {
			String expression = sc.next();
			int a = expression.charAt(0) - '0';
			int b = expression.charAt(2) - '0';
			System.out.println(a + b);
		}
	}
}
