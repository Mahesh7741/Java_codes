import java.util.ArrayList;
import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        String s = sc.next();
        ArrayList<Character> vect = new ArrayList<>();

        while (len != 0) {
            if (len % 2 == 1) {
                vect.add(s.charAt(0));  
            } else {
                vect.add(0, s.charAt(0));  
            }
            s = s.substring(1);  
            len = s.length();  
        }

        for (char ch : vect) {
            System.out.print(ch);
        }

        sc.close();
    }
}
