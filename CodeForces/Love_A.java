import java.util.Scanner;
public class Love_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                cnt++;
            }
        }
        
        int maxLength = (cnt > len / 2) ? len : 2 * cnt - 1;
        System.out.println(maxLength);
        sc.close();
    }
}
