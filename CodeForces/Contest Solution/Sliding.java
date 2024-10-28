import java.util.*;
public class Sliding{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-- >0){
			long n=sc.nextLong();
			long m=sc.nextLong();
			long r=sc.nextLong();
			long c=sc.nextLong();
			long a=m-c;
			long b=(n-r)*m;
			long d=(n-r)*(m-1);
			System.out.println(a+b+d);
		}
		sc.close();
	}
}