import java.util.*;
public class MakeItDivisibleBy25{
    static Scanner sc=new Scanner(System.in);
    static int count(String s, String t){
        int ct=0;
        while(s.length() > 0 && t.length() > 0){
            if(s.charAt(s.length()-1) == t.charAt(t.length()-1)){
                t=t.substring(0, t.length()-1);
            }
            else{
                ct++;
            }
            s=s.substring(0, s.length()-1);
        }
        return (t.length() > 0) ? Integer.MAX_VALUE : ct;
    }
    public static void solve(){
        String s=sc.next();
        String[] v={"00", "25", "50", "75"};
        long mn=Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            mn=Math.min(mn, count(s, v[i]));
        }
        System.out.println(mn);
    }
    public static void main(String[] args){
        int TCS=sc.nextInt();
        while(TCS-- > 0){
            solve();
        }
    }
}
