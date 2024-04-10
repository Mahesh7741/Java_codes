

public class PrintSubsequences {
    public static void main(String arg[]) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }

    public static void printSubsequences(String str, int index, String current) {
        int n = str.length();
        if (index == n) {
            System.out.println(current);
            return;
        }
        printSubsequences(str, index + 1, current + str.charAt(index));
        printSubsequences(str, index + 1, current);
    }
}
