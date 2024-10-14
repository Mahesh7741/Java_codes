import java.util.Scanner;

public class Opponents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        
        int count = 0;
        int maxCount = 0;
        
        scanner.nextLine();
        
        for (int i = 0; i < d; ++i) {
            String str = scanner.nextLine();
            
            if (str.contains("0")) {
                count++;
            } else {
                count = 0;
            }
            
            if (maxCount < count) {
                maxCount = count;
            }
        }
        
        System.out.println(maxCount);
        
        scanner.close();
    }
}
