import java.util.*;
public class ShohagLovesMod{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args){
		long t=sc.nextLong();
		while(t-- >0){
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				int val=(i*2)-1;
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}