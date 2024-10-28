import java.util.*;

public class EveryoneLovesTres {
    static Scanner sc = new Scanner(System.in); 

    public static void solve() {
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();
		if(n==1 || n==3){
			System.out.println("-1");
			return;
		}
        else if (n % 2 == 0) {
            for (int i = 0; i < n - 2; i++) {
                sb.append("3");
            }
			sb.append("66");
        } else {
            for (int i = 0; i < n - 4; i++) {
                sb.append("3");
            }
            sb.append("6366");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        sc.close();
    }
}
