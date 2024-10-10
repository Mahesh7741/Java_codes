import java.util.*;

public class BachgoldProblem {
    public static List<Integer> maximumPossible(int n) {
        List<Integer> li = new ArrayList<>();
        if (n % 2 == 1) {
            li.add(3);
            n -= 3;
        }
        while (n > 0) {
            li.add(2);
            n -= 2;
        }

        return li;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = maximumPossible(n);
        System.out.println(result.size());
		Collections.sort(result);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
