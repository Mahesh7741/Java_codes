import java.util.*;

public class VasyaAndBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] position = new int[n + 1];
        for (int i = 0; i < n; i++) {
            position[a[i]] = i;
        }

        int lastRemoved = -1;
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            int book = b[i];
            int currentPosition = position[book];
            
            if (currentPosition > lastRemoved) {
                int booksMoved = currentPosition - lastRemoved;
                result.append(booksMoved).append(" ");
                lastRemoved = currentPosition;
            } else {
                result.append(0).append(" ");
            }
        }
        
        System.out.println(result.toString().trim());
    }
}
