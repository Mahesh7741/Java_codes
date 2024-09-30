import java.util.*;
public class FindMinimumOperations{
	public static int findValue(int n,int k){
		if (k == 1) return n;
        int ans = 0;
        while (n > 0) {
            ans += n % k;
            n /= k;
        }
        return ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(findValue(n,k));
		}
	}
}