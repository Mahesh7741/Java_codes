import java.util.*;
public class TheatreSquare{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long div, len, wid;
		div = n / a;
		if (n % a == 0) len = div * a;
		else len = (div + 1) * a;
		div = m / a;
		if (m % a == 0) wid = div * a;
		else wid = (div + 1) * a;
		div = (len * wid) / (a * a);
		System.out.println(div);
	}
}
