import java.util.Scanner;

public class SimpleUpdateI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String binaryString = sc.nextLine();
            int cnt = binaryString.length() - binaryString.replace("1", "").length();
            int maxi = Math.max(cnt, n - k);
            System.out.println(maxi);
        }
        sc.close();
    }
}
