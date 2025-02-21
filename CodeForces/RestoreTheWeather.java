import java.util.*;

public class RestoreTheWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<int[]> a = new ArrayList<>();
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                a.add(new int[]{x, i});
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            a.sort(Comparator.comparingInt(o -> o[0]));
            Arrays.sort(b);

            for (int i = 0; i < n; i++) {
                c[a.get(i)[1]] = b[i];
            }

            for (int x : c) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
