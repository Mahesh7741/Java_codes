import java.util.*;
public class Maximums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long n, m = 0, a;
        n = sc.nextLong();

        for (int i = 0; i < n; i++) {
            a = sc.nextLong();
            if (i == 0) {
                System.out.print(a + " ");
                m = a;
            } else {
                System.out.print((a + m) + " ");
                m = Math.max(m, (a + m));
            }
        }
        System.out.println();

        sc.close();
	}
}