import java.util.Scanner;

public class LuckySubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long fr = 0, svn = 0, nai = 0;
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '4') {
                fr++;
            } else if (ch == '7') {
                svn++;
            } else {
                nai++;
            }
        }

        if (nai == s.length()) {
            System.out.println("-1");
        } else if (fr >= svn) {
            System.out.println("4");
        } else {
            System.out.println("7");
        }
        
        sc.close();
    }
}
