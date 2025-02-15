import java.util.*;

public class Cat { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        sc.nextLine();
        while (TC-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String cat = "meow";

        s = s.toLowerCase();
        StringBuilder sound = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (sound.length() == 0 || sound.charAt(sound.length() - 1) != c) {
                sound.append(c);
            }
        }

        if (cat.equals(sound.toString())) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
