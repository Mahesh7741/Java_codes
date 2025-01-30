import java.util.Scanner;

public class ChewbacaAndNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        StringBuilder result = new StringBuilder(x);
        
        for (int i = 0; i < x.length(); i++) {
            char digit = x.charAt(i);
            if (digit > '4') {
                result.setCharAt(i, (char) ('9' - digit + '0'));
            }
        }

        if (result.charAt(0) == '0') {
            result.setCharAt(0, '9');
        }

        System.out.println(result.toString());
    }
}
