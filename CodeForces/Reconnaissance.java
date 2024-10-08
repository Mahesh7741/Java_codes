import java.util.*;
public class Reconnaissance{
	public static int reconnaissance(int[] a,int n,int d){
		int cnt=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					continue;
				}
				else if(Math.abs(a[i]-a[j])<=d){
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int result=reconnaissance(a,n,d);
		System.out.println(result);
		sc.close();
	}
}