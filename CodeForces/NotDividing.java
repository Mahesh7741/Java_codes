import java.util.*;
public class NotDividing{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    arr[i]++;
                }
            }
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] % arr[i] == 0) {
                    arr[i + 1]++;
                }
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
