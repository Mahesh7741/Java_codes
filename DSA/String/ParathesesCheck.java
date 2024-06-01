import java.util.Stack;

public class ParathesesCheck {

    public static void main(String[] args) {
        String input = "(())[]";
        Boolean output = parathesesCheck(input);
        System.out.println(output);
    }

    public static Boolean parathesesCheck(String str) {
        Stack<Character> stackstr = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stackstr.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stackstr.isEmpty()) {
                    return false;
                }
                char top = stackstr.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stackstr.isEmpty();
    }
}
