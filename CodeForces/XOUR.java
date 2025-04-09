import java.util.*;

public class XOUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            Map<Integer, List<Integer>> valueMap = new HashMap<>();
            Map<Integer, List<Integer>> indexMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int key = v[i] / 4;
                valueMap.computeIfAbsent(key, k -> new ArrayList<>()).add(v[i]);
                indexMap.computeIfAbsent(key, k -> new ArrayList<>()).add(i);
            }

            for (int key : valueMap.keySet()) {
                Collections.sort(valueMap.get(key));
                Collections.sort(indexMap.get(key));
            }

            int[] ans = new int[n];
            for (int key : valueMap.keySet()) {
                List<Integer> values = valueMap.get(key);
                List<Integer> indices = indexMap.get(key);
                for (int j = 0; j < values.size(); j++) {
                    ans[indices.get(j)] = values.get(j);
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]);
                System.out.print(i == n - 1 ? "\n" : " ");
            }
        }

        sc.close();
    }
}
