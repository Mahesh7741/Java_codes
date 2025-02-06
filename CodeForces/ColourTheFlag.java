import java.util.*;
public class ColourTheFlag{
    static Scanner sc=new Scanner(System.in);
    static long pow(long x, long y, long m){
        long ans=1;
        x%=m;
        while(y > 0){
            if((y & 1) == 1) ans=(ans*x)%m;
            x=(x*x)%m;
            y>>=1;
        }
        return ans;
    }
    public static void solve(){
        int n=sc.nextInt(), m=sc.nextInt();
        char[][] v1=new char[n][m], v2=new char[n][m];
        boolean f1=true, f2=true;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                v1[i][j]=((i+j) % 2 == 0) ? 'W' : 'R';
                v2[i][j]=((i+j) % 2 == 0) ? 'R' : 'W';
            }
        }
        for(int i=0; i<n; i++){
            String row=sc.next();
            for(int j=0; j<m; j++){
                char c=row.charAt(j);
                if(c!='.'){
                    if(c!=v1[i][j]) f1=false;
                    if(c!=v2[i][j]) f2=false;
                }
            }
        }
        if(f1 || f2){
            System.out.println("YES");
            char[][] ans=f1 ? v1 : v2;
            for(char[] row: ans){
                System.out.println(new String(row));
            }
        }
        else System.out.println("NO");
    }
    public static void main(String[] args){
        int TCS=sc.nextInt();
        while(TCS-- > 0){
            solve();
        }
    }
}
