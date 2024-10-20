import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        for (int i = 1; i <= 25; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                p = i;
            }
        }
        int x = (p - 1) / 5; 
        int y = (p - 1) % 5; 
        System.out.println(Math.abs(2 - x) + Math.abs(2 - y)); 
        sc.close();
    }
}
