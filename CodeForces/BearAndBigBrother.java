import java.util.*;
public class BearAndBigBrother{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=0;
		while(a<=b){
			a *=3;
			b *=2;
			i++;
		}
		System.out.println(i);
		sc.close();
	}
}