import java.util.*;
public class RoundDownThePrice{ 
    static Scanner sc=new Scanner(System.in);
    public static int countDigit(long n) {
        return (int)Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            int sizeOfN = countDigit(n);
            long powerOf10 = (long)Math.pow(10, sizeOfN - 1);
            System.out.println(n - powerOf10);
        }
    }
}
