import java.util.*;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); 
        boolean isColor = false;
        for (int i = 0; i < n; i++) {
            String pixelRow = sc.nextLine();
            String[] pixels = pixelRow.split(" ");
            for (String pixel : pixels) {
                if (pixel.equals("C") || pixel.equals("M") || pixel.equals("Y")) {
                    isColor = true;
                    break;
                }
            }
            if (isColor) {
                break;
            }
        }
        if (isColor) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }

        sc.close();
    }
}
