import java.util.*;
public class MostUnstableArray{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(Math.min(2, n - 1) * m);
        }
    }
}
