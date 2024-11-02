import java.util.*;
public class GettingA{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        double sum = 0.0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        
        Arrays.sort(a);
        double div = sum / n;
        int ans = 0;

        while (div < 4.5) {
            ans++;
            for (int i = 0; i < n; i++) {
                if (a[i] < 5) {
                    sum += (5 - a[i]);
                    a[i] = 5;
                    break;
                }
            }
            div = sum / n;
        }
        
        System.out.println(ans);
        sc.close();
	}
}