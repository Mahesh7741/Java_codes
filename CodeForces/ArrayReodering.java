import java.util.*;
public class ArrayReodering{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr, (x, y) -> Integer.compare(x % 2, y % 2));
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(arr[i], 2 * arr[j]) != 1) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
