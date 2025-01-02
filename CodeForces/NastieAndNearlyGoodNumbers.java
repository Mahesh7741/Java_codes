import java.util.*;
public class NastieAndNearlyGoodNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- > 0){
			long a=sc.nextLong();
			long b=sc.nextLong();
			long z=a*(b+1);
			long x=a*b;
			long y=a;
			if(b==1){
				System.out.println("No");
			}else {
				System.out.println("Yes");
				System.out.println(y + " " + x + " " + z );
			}
		}
		sc.close();
	}
}