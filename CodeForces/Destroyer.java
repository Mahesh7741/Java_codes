import java.util.*;
public class Destroyer{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[n + 1];
            boolean flag = true;

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (temp < n) {
                    count[temp]++;
                } else {
                    count[n] = (int) 1e6;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (count[i] > count[i - 1]) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
