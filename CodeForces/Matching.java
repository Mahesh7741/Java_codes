import java.util.*;
public class Matching{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long T = sc.nextLong();
        while(T-- >0){
            String s = sc.next();
            long ans = 1;
            if (s.charAt(0) == '0') ans = 0;
            if (s.charAt(0) == '?') ans = 9;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '?') ans *= 10;
            }
            System.out.println(ans);
        }
    }
}
