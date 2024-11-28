import java.util.*;

public class DividingTheNumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        Deque<Integer> q = new ArrayDeque<>();
        List<Integer> v = new ArrayList<>();

        long x = 0, y = 0;

        if (n % 2 == 0) {
            for (int i = n; i >= 1; i--) {
                q.addLast(i);
            }
        } else {
            for (int i = n; i >= 2; i--) {
                q.addLast(i);
            }
        }

        int k = 1;
        while (!q.isEmpty()) {
            if (k % 2 == 1) {
                if (!q.isEmpty()) {
                    v.add(q.peekFirst());
                    x += q.pollFirst();
                }
                if (!q.isEmpty()) {
                    y += q.pollFirst();
                }
            } else {
                if (!q.isEmpty()) {
                    v.add(q.peekLast());
                    x += q.pollLast();
                }
                if (!q.isEmpty()) {
                    y += q.pollLast();
                }
            }
            k++;
        }

        if (n % 2 == 1) {
            if (x < y) {
                v.add(1);
                x++;
            } else {
                y++;
            }
        }

        System.out.println(Math.abs(x - y));
        System.out.print(v.size() + " ");
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}
