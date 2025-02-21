import java.util.*;

public class VladBuildingBeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int minEven = 0, minOdd = 0, oddCount = 0, evenCount = 0;
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 != 0) {
                    oddCount++;
                    if (oddCount == n) break;
                    if (minOdd == 0 || minOdd > a[i]) {
                        minOdd = a[i];
                    }
                } else {
                    evenCount++;
                    if (evenCount == n) break;
                    if (minEven == 0 || minEven > a[i]) {
                        minEven = a[i];
                    }
                }
            }

            if (oddCount == n || evenCount == n || minEven > minOdd) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
