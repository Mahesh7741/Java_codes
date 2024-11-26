import java.util.*;
public class DoorsBreakingAndRepairing{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if(x > y) {
			System.out.println(n);
			return;
		}
		int k = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] <= x) {
				k++;
			}
		}
		if(k % 2 == 0) {
			System.out.println(k / 2);
		} else {
			System.out.println(k / 2 + 1);
		}
	}
}
