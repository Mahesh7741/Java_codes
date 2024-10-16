import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        int sum = (int) (n / 5); 
        if (n % 5 != 0) {
            sum += 1; 
        }
        System.out.println(sum);
    }
}
