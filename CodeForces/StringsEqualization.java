import java.util.Scanner;

public class StringsEqualization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            String s = sc.next();
            String str2 = sc.next(); 
            int n = s.length();
            int c = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (s.charAt(i) == str2.charAt(j)) {
                        c++;
                    }
                }
            }

            if (c == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
