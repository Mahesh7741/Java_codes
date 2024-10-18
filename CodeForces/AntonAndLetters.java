import java.util.*;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim(); 
        sc.close();
        if (s.equals("{}")) {
            System.out.println(0);
            return;
        }
        String newS = s.substring(1, s.length() - 1);
        String[] str = newS.split(", ");
        Set<String> set = new HashSet<>();
        for (String se : str) {
            set.add(se); 
        }
        System.out.println(set.size());
    }
}
