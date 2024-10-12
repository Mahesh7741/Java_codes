import java.util.*;
public class CrazyComputer{
	public static int remainWord(int n,int c,int[] t){
		int cnt=1;
		for(int i=1;i<n;i++){
			if(t[i]-t[i-1]<=c){
				cnt++;
			}else{
				cnt=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		sc.nextLine();
		int[] t=new int[n];
		for(int i=0;i<n;i++){
			t[i]=sc.nextInt();
		}
		int result=remainWord(n,c,t);
		System.out.println(result);
		sc.close();
	}
}