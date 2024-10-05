import java.util.*;

public class Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine().trim();
        question = question.substring(0, question.length() - 1);    
        char lastLetter = ' ';    
        for (int i = question.length() - 1; i >= 0; i--) {
            char currentChar = question.charAt(i);
            if (currentChar != ' ') {
                lastLetter = Character.toUpperCase(currentChar);
                break;
            }
        }
        
        if (lastLetter == 'A' || lastLetter == 'E' || lastLetter == 'I' ||
            lastLetter == 'O' || lastLetter == 'U' || lastLetter == 'Y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
