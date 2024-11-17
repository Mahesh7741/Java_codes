import java.util.*;

public class SuperultraFavoritePermutation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            if (n <= 4) {
                output.append("-1\n");
                continue;
            }

            List<Integer> odd = new ArrayList<>();
            List<Integer> even = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    odd.add(i);
                } else {
                    even.add(i);
                }
            }

            if (odd.contains(5)) {
                odd.remove(Integer.valueOf(5));
                odd.add(5);
            }

            if (even.contains(4)) {
                even.remove(Integer.valueOf(4));
                even.add(0, 4);
            }

            List<Integer> result = new ArrayList<>();
            result.addAll(odd);
            result.addAll(even);

            for (int num : result) {
                output.append(num).append(" ");
            }
            output.append("\n");
        }

        System.out.print(output);
    }
}
