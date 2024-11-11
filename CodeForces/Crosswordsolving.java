import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crosswordsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        String s = sc.next();
        String t = sc.next();

        long min = 1000000000000L;
        List<Long> v = new ArrayList<>();
        List<Long> temp = new ArrayList<>();

        for (int i = 0; i <= m - n; i++) {
            temp.clear();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != t.charAt(i + j)) {
                    temp.add((long) (j + 1));
                }
            }

            if (min > temp.size()) {
                min = temp.size();
                v = new ArrayList<>(temp);
            }
        }

        System.out.println(v.size());
        for (long pos : v) {
            System.out.print(pos + " ");
        }
        sc.close();
    }
}
