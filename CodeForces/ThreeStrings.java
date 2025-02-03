import java.util.*;

public class ThreeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TCS = sc.nextInt();
        sc.nextLine();  

        for (int TC = 1; TC <= TCS; ++TC) {
            solve(sc);
        }
        
        sc.close();
    }

    public static void solve(Scanner sc) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
