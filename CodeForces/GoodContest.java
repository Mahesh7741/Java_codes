import java.util.*;

public class GoodContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();   
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int before = Integer.parseInt(str[1]);
            int after = Integer.parseInt(str[2]);
            if (before >= 2400 && after > before) {
                System.out.println("YES");
                sc.close();
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
