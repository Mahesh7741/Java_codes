import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int neg = 0; 
        int pos = 0; 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == -1) { 
                if (pos == 0) {
                    neg++; 
                } else {
                    pos--; 
                }
            } else {
                pos += a[i];
            }
        }

        System.out.println(neg);
        sc.close();
    }
}
