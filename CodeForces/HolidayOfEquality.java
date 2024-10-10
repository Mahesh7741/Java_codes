import java.util.*;
public class HolidayOfEquality{
	public static int minimumBurles(int[] a,int n){
		int maxBurle=Integer.MIN_VALUE;
		int totalBurleHave=0;
		for(int i:a){
			maxBurle=Math.max(maxBurle,i);
			totalBurleHave +=i;
		}
		int totalBurleQue=maxBurle*n;
		return totalBurleQue-totalBurleHave;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int result=minimumBurles(a,n);
		System.out.println(result);
		sc.close();
	}
}