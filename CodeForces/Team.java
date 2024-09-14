import java.util.Scanner;

public class Team{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			int petya=sc.nextInt();
			int vesya=sc.nextInt();
			int Tenya=sc.nextInt();
			if((petya+vesya+Tenya)>=2){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}