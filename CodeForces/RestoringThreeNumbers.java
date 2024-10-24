import java.util.*;
public class RestoringThreeNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long[] a=new long[4];
		for(int i=0;i<4;i++){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		for(int i=0;i<3;i++){
			System.out.print(a[3]-a[i] +" ");
		}
		sc.close();
	}
}