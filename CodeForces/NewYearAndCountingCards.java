import java.util.Scanner;

public class NewYearAndCountingCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
            else if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
