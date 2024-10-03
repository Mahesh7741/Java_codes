import java.util.*;

public class Word {
    public static String generate(String s) {
        int upperLatterCount = 0;
        int lowerLatterCount = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperLatterCount++;
            } else {
                lowerLatterCount++;
            }
        }
        if (upperLatterCount > lowerLatterCount) {
            return s.toUpperCase();
        } else {
            return s.toLowerCase();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newString = generate(s);
        System.out.println(newString);
        sc.close();
    }
}
