import java.util.*;
public class MultiplyBy2DivideBy6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-- >0){
			long n = sc.nextLong();
            long num = n, cnt = 0;
            while (num != 1) {
                if (num % 6 == 0) {
                    num /= 6;
                    cnt++;
                } else if (num % 3 == 0) {
                    num *= 2;
                    cnt++;
                } else {
                    cnt = -1;
                    break;
                }
            }
            System.out.println(cnt);
		}
	}
}