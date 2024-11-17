import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifferentIsGood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueChars.add(s.charAt(i));
        }
        
        int unusedChars = 26 - uniqueChars.size();
        int requiredChanges = n - uniqueChars.size();
        
        if (unusedChars < requiredChanges) {
            System.out.println("-1");
        } else {
            System.out.println(requiredChanges);
        }
        
        sc.close();
    }
}
