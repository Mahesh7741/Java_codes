import java.util.*;
public class LauraAndOperations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] v = new int[3];

            int x, y, z, tmp;

            x = a; y = b; z = c;
            tmp = Math.min(y, z);
            y -= tmp;
            z -= tmp;
            x += tmp;
            if (x > 0 && Math.max(y, z) % 2 == 0) v[0] = 1;

            x = a; y = b; z = c;
            tmp = Math.min(x, z);
            x -= tmp;
            z -= tmp;
            y += tmp;
            if (y > 0 && Math.max(x, z) % 2 == 0) v[1] = 1;

            x = a; y = b; z = c;
            tmp = Math.min(x, y);
            x -= tmp;
            y -= tmp;
            z += tmp;
            if (z > 0 && Math.max(x, y) % 2 == 0) v[2] = 1;

            for (int ele : v) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
