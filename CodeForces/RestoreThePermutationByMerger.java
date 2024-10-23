import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Set<Integer> st = new LinkedHashSet<>();
            int k = 2 * n;
            for (int i = 0; i < k; i++) {
                int value = sc.nextInt();
                st.add(value);
            }
            for (int num : st) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
