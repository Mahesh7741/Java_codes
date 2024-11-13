import java.util.Scanner;

public class Inbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long[] a = new long[(int) n];
        
        long w = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 1) {
                w++;
            }
        }
        
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
                w--;
            } else {
                if (i > 0 && a[i - 1] == 1 && w > 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
