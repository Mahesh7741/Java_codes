import java.util.*;

public class Codepool {
    static Scanner sc = new Scanner(System.in);

    public static String rotN(String text, int n) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' + n) % 26 + 'a'));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter encrypted text: ");
        String encryptedText = sc.nextLine();
        String decodedText = rotN(encryptedText, 4);
        
        System.out.println("Decoded Message: " + decodedText);
    }
}
