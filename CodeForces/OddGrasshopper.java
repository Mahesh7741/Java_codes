import java.util.*;
public class OddGrasshopper{
    static Scanner sc=new Scanner(System.in);
    public static void solve(){
        long x=sc.nextLong(), n=sc.nextLong();
        int m=(x&1)==1 ? 1 : -1;
        if(n%4==1) x+=m*n;
        else if(n%4==2) x-=m;
        else if(n%4==3) x-=m*(n+1);
        System.out.println(x);
    }
    public static void main(String[] args){
        int TCS=sc.nextInt();
        while(TCS-- > 0){
            solve();
        }
    }
}
