import java.util.*;

public class TwoShuffledSequences {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        List<Long> a = new ArrayList<>();
        List<Long> ascend = new ArrayList<>();
        List<Long> descend = new ArrayList<>();

        for (long i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        Collections.sort(a);
        boolean check = true;

        for (int i = 0; i < n; i++) {
            if (i + 2 < n && Objects.equals(a.get(i), a.get(i + 2))) {
                check = false;
                break;
            }
            if (i > 0 && Objects.equals(a.get(i), a.get(i - 1))) {
                descend.add(a.get(i));
            } else {
                ascend.add(a.get(i));
            }
        }

        if (!check) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(ascend.size());
            for (long num : ascend) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println(descend.size());
            for (int i = descend.size() - 1; i >= 0; i--) {
                System.out.print(descend.get(i) + " ");
            }
            System.out.println();
        }
    }
}
