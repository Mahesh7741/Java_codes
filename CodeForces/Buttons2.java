import java.util.*;

public class Buttons2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int TC = sc.nextInt();
        while (TC-- > 0) {
            solve();
        }
    }

    static void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((c & 1) == 1) {  
            if (b > a)
                System.out.println("Second");
            else
                System.out.println("First");
        } else {  
            if (a > b)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}
