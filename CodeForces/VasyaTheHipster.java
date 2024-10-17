import java.util.*;
public class VasyaTheHipster{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int differenSocks=Math.min(a,b);
		int sameSocks=(Math.max(a,b)-differenSocks)/2;
		System.out.print(differenSocks + " "+sameSocks);
		sc.close();
	}
}