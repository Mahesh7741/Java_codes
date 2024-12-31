import java.util.*;
public class ThornsAndCoins{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();
            long ans = 0;
            for (int i = 0; i < n - 2; i++) { 
                if (s.charAt(i) == '.' && s.charAt(i + 1) == '*' && s.charAt(i + 2) == '*')
                    break;
                if (s.charAt(i) == '@') {
                    ans++;
                    if (i + 2 < n && s.charAt(i + 1) == '*' && s.charAt(i + 2) == '*') 
                        break;
                }
            }
            System.out.println(ans);
        }
    }
}
