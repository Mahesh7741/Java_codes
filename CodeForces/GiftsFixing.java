import java.util.*;
public class GiftsFixing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
			int n=sc.nextInt();
			long[] a=new long[n];
			long[] b=new long[n];
			long minA=Integer.MAX_VALUE,minB=Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				a[i]=sc.nextLong();
				minA=Math.min(a[i],minA);
			}
			for(int i=0;i<n;i++){
				b[i]=sc.nextLong();
				minB=Math.min(b[i],minB);
			}
			long total=0;
			for(int i=0;i<n;i++){
				long diff=Math.max(a[i]-minA,b[i]-minB);
				total +=diff;
			}
			System.out.println(total);
		}
		sc.close();
	}
}