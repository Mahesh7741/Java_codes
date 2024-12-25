import java.util.*;
public class GrassField{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long sum = a + b + c + d;
            if (sum == 0) {
                System.out.println(0);
            } else if (sum == 4) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }
}
