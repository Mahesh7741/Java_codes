import java.util.*;

public class PermutationsOfString {
    public static void permutationsOfString(String s, String result, String s1) {
        if (s.length() == 0) {
            if (checkString(result, s1)) {
                System.out.println("True");
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String remainingString = s.substring(0, i) + s.substring(i + 1);
            permutationsOfString(remainingString, result + curr, s1);
        }
    }

    static boolean checkString(String result, String s1) {
        return result.equals(s1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        permutationsOfString(s, "", s1);
        sc.close();
    }
}
