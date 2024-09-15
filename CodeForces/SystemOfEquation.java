import java.util.Scanner;
public class SystemOfEquation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		for(int a=0;a*a<=n && a<=m;++a){
			int b=n-(a*a);
			if((a+(b*b))==m){
				count++;
			}
		}
		System.out.println(count);
		sc.close();	
	}
}