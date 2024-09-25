import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int capacity = 0;      
        int count = 0;          

        for (int i = 1; i <= n; i++) {
            int exits = sc.nextInt();  
            int enters = sc.nextInt();
            count = count - exits + enters; 
            capacity = Math.max(capacity, count);  
        }

        System.out.println(capacity);
        sc.close();
    }
}
