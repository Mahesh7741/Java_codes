import java.util.Scanner;

public class MahmoudAndEhab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = 1;

        while (T-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();

        if ((n & 1) == 1) { 
            System.out.println("Ehab");
        } else {  
            System.out.println("Mahmoud");
        }
    }
}
