import java.util.*;
public class Rigged{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long[][] arr = new long[n][2];
            
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
            }
            
            boolean canWin = true;
            for (int i = 1; i < n; i++) {
                if (arr[i][0] >= arr[0][0] && arr[i][1] >= arr[0][1]) {
                    canWin = false;
                    break;
                }
            }
            
            System.out.println(canWin ? arr[0][0] : -1);
        }
    }
}
