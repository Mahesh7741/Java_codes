import java.util.*;
public class FashionabLee{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-- >0){
			long n=sc.nextLong();
			if(n%4==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		sc.close();
	}
}