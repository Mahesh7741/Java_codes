import java.util.*;

public class StringTask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> ls = new ArrayList<>(Arrays.asList('A', 'a', 'O', 'o', 'Y', 'y', 'E', 'e', 'U', 'u', 'I', 'i'));
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (!ls.contains(ch)) {
                sb.append('.').append(Character.toLowerCase(ch));
            }
        }
        
        System.out.println(sb.toString());
    }
}
