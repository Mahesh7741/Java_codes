import java.util.*;
public class MemeProblem{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int tc = sc.nextInt();
		while (tc-- > 0) {
			double d = sc.nextDouble();
			if (d >= 1 && d <= 3) {
				System.out.println("N");
			} else {
				double a = (d + Math.sqrt(d * d - 4.0 * d)) / 2.0;
				double b = (d - Math.sqrt(d * d - 4.0 * d)) / 2.0;
				System.out.printf("Y %.9f %.9f\n", a, b);
			}
		}
	}
}
