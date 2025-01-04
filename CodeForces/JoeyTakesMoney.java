import java.util.*;

public class JoeyTakesMoney{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            long sum = 1;
            for(int i = 0; i < n; i++){
                long a = sc.nextLong();
                sum *= a;
            }
            sum += (n - 1);
            System.out.println(sum * 2022);
        }
        sc.close();
    }
}
