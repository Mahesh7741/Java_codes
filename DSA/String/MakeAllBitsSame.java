package DSA.String;

public class MakeAllBitsSame {
    public static void main(String arg[]) {
        String str = "101";
        System.out.println(canMakeAllBitsSame(str) ? "Yes" : "No");
    }

    public static boolean canMakeAllBitsSame(String str) {
        int zero = 0;
        int ones = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') {
                zero++;
            }
            ones++;
        }
        return (zero == 1 || ones == 1);
    }
}
