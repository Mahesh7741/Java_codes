

public class RightRotation {
    public static void main(String arg[]) {
        String s = "MaheshSavant";
        int n = 2;
        String result = rightRotation(s, n);
        System.out.println(result);
        System.out.println(leftRotation(s, n));
        System.out.println(s.substring(5));
        System.out.println(s.substring(0,5));
    }

    public static String leftRotation(String s, int n) {
        String ans = s.substring(n) + s.substring(0, n);
        return ans;
    }

    public static String rightRotation(String s, int n) {
        return leftRotation(s, s.length() - n);
    }
}