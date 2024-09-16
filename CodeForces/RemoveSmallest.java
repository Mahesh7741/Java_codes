import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class RemoveSmallest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int test=0;test<t;test++){
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			boolean possible=true;
			for(int i=1;i<n;i++){
				if(a[i]-a[i-1]>1){
					possible=false;
					break;
				}
			}
			
			if(possible){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		sc.close();
	}
}