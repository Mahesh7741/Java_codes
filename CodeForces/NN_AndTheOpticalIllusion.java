import java.util.*;
public class NN_AndTheOpticalIllusion{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int tc = 1;
		while(tc-- > 0) {
			solved();
		}
	}
	
	static void solved() {
		double n = sc.nextDouble();
		double r = sc.nextDouble();
		double pi = 3.141592653589793;
		double A = (2 * pi / n);
		double B = ((pi - (2 * pi) / n) / 2);
		double res = (r * Math.sin(A) / (2 * Math.sin(B) - Math.sin(A)));
		System.out.printf("%.8f%n", res);
	}
}
