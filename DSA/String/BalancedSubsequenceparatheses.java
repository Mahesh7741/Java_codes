

public class BalancedSubsequenceparatheses {

    static int maxLength(String s, int n) {

        int invalidOpenBraces = 0;
        int invalidCloseBraces = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {

                invalidOpenBraces++;
            } else {
                if (invalidOpenBraces == 0) {

                    invalidCloseBraces++;
                } else {
                    invalidOpenBraces--;
                }
            }
        }
        return (n - (invalidOpenBraces+ invalidCloseBraces));
    }

    public static void main(String[] args) {
        String s = "()(((((()";
        int n = s.length();
        System.out.println(maxLength(s, n));
    }
}