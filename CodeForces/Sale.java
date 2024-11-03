import java.util.*;
public class Sale{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        int s = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] >= 0) {
                break;
            }
            s += a[i];
        }
        
        System.out.println(-s);
	}
}