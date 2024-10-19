import java.util.*;
public class ChoosingTeams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		int cnt=0;
		int val=5-k;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(val>=a[i]){
				cnt++;
			}
		}
		System.out.println(cnt/3);
		sc.close();
	}
}