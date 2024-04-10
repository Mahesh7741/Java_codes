

public class MinFlipOfBinaryStringInAlter {
    public static void main(String arg[]) {
        String str = "001";
        System.out.println(minFlipOfString(str));
    }

    public static int minFlipOfString(String str) {
        return (Math.min(filpStringStarting(str, '0'), filpStringStarting(str, '1')));
    }

    public static int filpStringStarting(String str, char expected) {
        int filpCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != expected) {
                filpCount++;
            }
            expected = filp(expected);
        }
        return filpCount;
    }

    public static char filp(char ch) {
        return (ch == '0') ? '1' : '0';
    }
}
