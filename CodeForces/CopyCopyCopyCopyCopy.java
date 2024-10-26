import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            Set<Integer> s = new HashSet<>();
            
            while (a-- > 0) {
                int b = sc.nextInt();
                s.add(b);
            }
            
            System.out.println(s.size());
        }
        
        sc.close();
    }
}
