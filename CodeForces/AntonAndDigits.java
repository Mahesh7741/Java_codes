import java.util.*;
public class AntonAndDigits{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long k2=sc.nextLong();
		long k3=sc.nextLong();
		long k5=sc.nextLong();
		long k6=sc.nextLong();
		long sum=0;
		long n=Math.min(Math.min(k2,k5),Math.min(k5,k6));
		k2 -=n;
		long m=Math.min(k3,k2);
		sum=(256*n)+(32*m);
		System.out.println(sum);
		sc.close();
	}
}