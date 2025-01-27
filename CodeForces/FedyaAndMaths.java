import java.util.Scanner;

public class FedyaAndMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if (s.length() < 2) {
            int n = s.charAt(0) - '0';
            if (n % 4 == 0)
                System.out.println(4);
            else
                System.out.println(0);
            return;
        }
        
        String str = s.substring(s.length() - 2);
        int n = Integer.parseInt(str);
        
        if (n % 4 == 0)
            System.out.println(4);
        else
            System.out.println(0);
        
        sc.close();
    }
}
