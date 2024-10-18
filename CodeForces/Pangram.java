import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        if (n < 26) {
            System.out.println("NO");
            sc.close();
            return;
        }

        int[] alp = new int[26]; 
        String newStr = s.toLowerCase(); 
        for (char c : newStr.toCharArray()) {
            alp[c - 'a'] = 1;
        }

        boolean check = true;
        for (int i : alp) {
            if (i != 1) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
