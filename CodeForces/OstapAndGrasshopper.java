import java.util.*;

public class OstapAndGrasshopper {
    public static void ostapAndGrasshopper(int n, int k, String s) {
        int startPosition = -1;
        int insectPosition = -1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'G') {
                startPosition = i;
            } else if (s.charAt(i) == 'T') {
                insectPosition = i;
            }
        }

        if (startPosition < insectPosition) {
            for (int i = startPosition; i < n; i += k) {
                if (s.charAt(i) == '#') {
                    System.out.println("NO");
                    return;
                } else if (s.charAt(i) == 'T') {
                    System.out.println("YES");
                    return;
                }
            }
        } else {
            for (int i = startPosition; i >= 0; i -= k) {
                if (s.charAt(i) == '#') {
                    System.out.println("NO");
                    return;
                } else if (s.charAt(i) == 'T') {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        ostapAndGrasshopper(n, k, s);
        sc.close();
    }
}
