import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        String s3 = s + s2;
        System.out.print(s3);
        
        sc.close();
    }
}
