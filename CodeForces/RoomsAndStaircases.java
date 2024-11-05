import java.util.Scanner;

public class RoomsAndStaircases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();
            int[] a = new int[1001]; 

            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i) - '0';
            }

            if (a[0] == 1 || a[(int)(n - 1)] == 1) { 
                System.out.println(n * 2);
            } else {
                int one = 0, leftVisit = 0, rightVisit = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 1) {
                        one = 1;
                        leftVisit = i;
                        break;
                    }
                }

                for (int j = (int)(n - 1); j >= 0; j--) { 
                    if (a[j] == 1) {
                        one = 1;
                        rightVisit = (int)(n - 1 - j); 
                        break;
                    }
                }

                long ans = 2 * (n - Math.min(leftVisit, rightVisit));
                if (one == 0) {
                    System.out.println(n);
                } else {
                    System.out.println(ans);
                }
            }
        }
        
        sc.close();
    }
}
