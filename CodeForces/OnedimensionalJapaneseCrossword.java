import java.util.*;

public class OnedimensionalJapaneseCrossword {
    public static void decode(int n, String s) {
        List<Integer> li = new ArrayList<>();
        int cnt = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'B') {
                cnt++;
            } else if (cnt != 0) {
                li.add(cnt);
                cnt = 0;
            }
        }
        if (cnt != 0) {
            li.add(cnt);
        }
		System.out.println(li.size());
        for (int i : li) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        decode(n, s);
        sc.close();
    }
}
