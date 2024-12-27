import java.util.*;
public class FollowingDirections{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int x = 0, y = 0;
            boolean found = false;

            for (char ch : s.toCharArray()) {
                if (ch == 'U') y++;
                if (ch == 'D') y--;
                if (ch == 'R') x++;
                if (ch == 'L') x--;
                if (x == 1 && y == 1) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Yes" : "No");
        }
    }
}
