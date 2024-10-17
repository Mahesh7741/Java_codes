import java.util.*;

public class VitalyAndNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        sc.nextLine(); 
        int flats = 0; 
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] light = str.split(" ");
            for (int j = 0; j < 2 * m; j += 2) {
                if (light[j].equals("1") || light[j + 1].equals("1")) {
                    flats++;
                }
            }
        }
        System.out.println(flats);
        sc.close();
    }
}
