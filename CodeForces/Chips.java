import java.util.Scanner;
public class Chips{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		m %=(n*(n+1)/2);
		for(int i=1;i<=n;i++){
			if(m<i){
				break;
			}
			m -=i;
		}
		System.out.println(m);
		sc.close();
	}
}