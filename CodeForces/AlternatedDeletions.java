import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlternatedDeletions {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();  // Number of elements
        ArrayList<Integer> oV = new ArrayList<>();
        ArrayList<Integer> eV = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k % 2 != 0) {
                oV.add(k);  // Add to odd values
            } else {
                eV.add(k);  // Add to even values
            }
        }
        
        // Sort both lists in ascending order
        Collections.sort(oV);
        Collections.sort(eV);
        
        int l1 = eV.size();
        int l2 = oV.size();
        
        if (l1 == l2 || Math.abs(l1 - l2) == 1) {
            System.out.println(0);
        } else {
            int sum = 0;
            if (l1 > l2) {
                int x = l1 - l2 - 2;
                for (int i = x; i >= 0; i--) {
                    sum += eV.get(i);
                }
            } else {
                int x = l2 - l1 - 2;
                for (int i = x; i >= 0; i--) {
                    sum += oV.get(i);
                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}
