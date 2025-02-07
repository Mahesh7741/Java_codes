import java.util.*;
public class LuntikAndSubsequences{
    static Scanner sc=new Scanner(System.in);
    static long fact(long n){
        if(n==0) return 1;
        long res=1;
        for(long i=2; i<=n; i++) res*=i;
        return res;
    }
    static long gcd(long a, long b){
        return (b==0) ? a : gcd(b, a%b);
    }
    static long lcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    static long mypow(long a, long b){
        long ans=1;
        while(b > 0){
            if((b & 1) == 1) ans*=a;
            a*=a;
            b/=2;
        }
        return ans;
    }
    static boolean isPrime(long n){
        if(n<=1) return false;
        for(long i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void solve(){
        int n=sc.nextInt();
        long ct1=0, ct0=0;
        for(int i=0; i<n; i++){
            int x=sc.nextInt();
            if(x==1) ct1++;
            else if(x==0) ct0++;
        }
        if(ct1!=0){
            long ans=(ct0==0) ? ct1 : ct1*mypow(2,ct0);
            System.out.println(ans);
        }
        else System.out.println(0);
    }
    public static void main(String[] args){
        int TC=sc.nextInt();
        while(TC-- > 0){
            solve();
        }
    }
}
