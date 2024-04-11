public class CountStringWithConsecutive {
    public static void main(String[] args) {
        int n =4 ;
        int result = countStringWithConsecutive(n);
        System.out.println(result);
    }

    public static boolean checkConsecutive(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) =='1' && str.charAt(i + 1)=='1') {
                return true;
            }
        }
        return false;
    }

    public static int countStringWithConsecutive(int n) {
        int cnt = 0;
        for (int i = 0; i < Math.pow(2, n); i++) {
            String str = Integer.toBinaryString(i);
            if (n > str.length()) {
                for (int j = 0; j < n - str.length(); j++) {
                    str = "0" + str;
                }
            }
            if (checkConsecutive(str)) {
                cnt++;
            }
        }
        return cnt;
    }
}
