import java.util.*;

public class GiftFromOrangutan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = Integer.MIN_VALUE; 
            int min = Integer.MAX_VALUE;  
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }
            Arrays.sort(a);
            for (int i = 0; i < n / 2; i++) {
                int temp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = temp;
            }    
            int sum = 0; 
            for (int i = 1; i < n; i++) {
                    a[i] = min;
            }
            for (int i = 0; i < n; i++) {
                sum += max - a[i]; 
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
}
