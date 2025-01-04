import java.util.*;

public class PrependAndAppend{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0){
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			int cnt=0;
			int low=0 , high=n-1;
			while(high > low){
				if(s.charAt(low)== '0' && s.charAt(high)== '1' || s.charAt(low)=='1' && s.charAt(high)=='0'){
					high--;
					low++;
					cnt +=2;
				}
				else{
					break;
				}
			}
			System.out.println(n-cnt);
		}
		sc.close();
	}
}