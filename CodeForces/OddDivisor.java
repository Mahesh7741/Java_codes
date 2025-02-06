import java.util.*;
public class OddDivisor{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-- > 0){
            long n=sc.nextLong();
            if((n & 1) == 1){
                System.out.println("YES");
            }
            else{
                boolean ok=false;
                long div=n;
                while(div > 2){
                    div /= 2;
                    if((div & 1) == 1){
                        if(n % div == 0){
                            ok=true;
                            break;
                        }
                    }
                }
                if(ok){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
