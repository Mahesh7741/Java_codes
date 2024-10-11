import java.util.*;
public class Compote{
	public static int maximumCooks(int a,int b,int c){
		int sum=0;
		int min=Integer.MAX_VALUE;
		if(!((a>=1) && (b/2)>=1 && (c/4 >=1))){
			return 0;
		}
		else{
			int[] arr={a/1,b/2,c/4};
			for(int i:arr){
				min=Math.min(min,i);
			}
		}
		return min*7;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result= maximumCooks(a,b,c);
		System.out.println(result);
		sc.close();
	}
}