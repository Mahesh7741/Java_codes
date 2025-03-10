import java.util.*;
public class GameWithIntegers {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println(x % 3 == 0 ? "Second" : "First");
        }
    }
}
