import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cormen  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        ArrayList<Long> vec = new ArrayList<>();
        long total = 0;
        
        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            vec.add(temp);
            total += temp;
        }

        total -= vec.get(0);
        for (int i = 1; i < n; i++) {
            vec.set(i, Math.max(vec.get(i), k - vec.get(i - 1)));
            total -= vec.get(i);
        }

        System.out.println(Math.abs(total));
        for (long num : vec) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
