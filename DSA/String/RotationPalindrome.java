package DSA.String;

public class RotationPalindrome {
    public static boolean isPalindrome(String str) {
        int firstP = 0;
        int lastP = str.length() - 1;
        while (firstP < lastP) {
            if (str.charAt(firstP) != str.charAt(lastP)) {
                return false;
            }
            firstP++;
            lastP--;
        }
        return true;
    }

    public static boolean rotationPalindrome(String str) {
        if (isPalindrome(str)) {
            return true;
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            if (isPalindrome(rotated)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        String str = "aaaad";
        boolean result = rotationPalindrome(str);
        System.out.println(result);
    }
}
