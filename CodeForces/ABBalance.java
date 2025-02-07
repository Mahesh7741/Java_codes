import java.util.*;
public class ABBalance{
    static Scanner sc=new Scanner(System.in);
    public static void solve(){
        String s=sc.next();
        char[] arr=s.toCharArray();
        if(arr[0]!=arr[arr.length-1]){
            arr[0]=(arr[0]=='a') ? 'b' : 'a';
        }
        System.out.println(new String(arr));
    }
    public static void main(String[] args){
        int TCS=sc.nextInt();
        while(TCS-- > 0){
            solve();
        }
    }
}
