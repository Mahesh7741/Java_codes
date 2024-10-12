import java.util.*;
public class BuyAShovel{
	public static int minimumShovels(int k,int r){
		for(int i=1;i<10;i++){
			if(i*k%10 ==0 || i*k%10==r){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		int result= minimumShovels(k,r);
		System.out.println(result);
		sc.close();
	}
}