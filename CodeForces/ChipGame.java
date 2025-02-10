import java.util.*;
public class ChipGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if ((n + m) % 2 != 0) 
                System.out.println("Burenka");
            else 
                System.out.println("Tonya");
        }
    }
}
