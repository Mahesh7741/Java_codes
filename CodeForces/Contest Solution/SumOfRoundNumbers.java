import java.util.*;
public class SumOfRoundNumbers{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T=sc.nextInt();
		while(T-- > 0){
			long n=sc.nextLong();
			long power=1;
			ArrayList<Long> ans=new ArrayList<>();
			while(n > 0){
				if(n % 10 > 0)
					ans.add((n % 10) * power);
				n /= 10;
				power *= 10;
			}
			System.out.println(ans.size());
			for(long ele: ans)
				System.out.print(ele+" ");
			System.out.println();
		}
	}
}
