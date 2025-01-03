import java.util.*;
public class Marathon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long T=sc.nextLong();
		while(T-- >0){
			long[] a=new long[4];
			for(int i=0;i<4;i++){
				a[i]=sc.nextLong();
			}
			long cnt=0;
			for(int i=1;i<4;i++){
				if(a[i]>a[0]){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}