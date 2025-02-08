import java.util.*;
public class LongComparison {
    static Scanner sc = new Scanner(System.in);
    
    public static void solve() {
        long x1 = sc.nextLong(), p1 = sc.nextLong();
        long x2 = sc.nextLong(), p2 = sc.nextLong();
        
        if (x1 != x2) {
            if (p1 == p2) {
                if (x1 > x2) System.out.println(">");
                else System.out.println("<");
            } else {
                long N1 = (long) Math.log10(x1) + 1 + p1;
                long N2 = (long) Math.log10(x2) + 1 + p2;
                if (N1 > N2) System.out.println(">");
                else if (N1 < N2) System.out.println("<");
                else {
                    String s = Long.toString(x1);
                    String p = Long.toString(x2);
                    int size = Math.min(s.length(), p.length());
                    char ans = '=';
                    
                    for (int i = 0; i < size; i++) {
                        if (s.charAt(i) > p.charAt(i)) {
                            ans = '>';
                            break;
                        }
                        if (p.charAt(i) > s.charAt(i)) {
                            ans = '<';
                            break;
                        }
                    }
                    
                    if (ans == '=') {
                        if (s.length() > p.length()) {
                            for (int i = size; i < s.length(); i++) {
                                if (s.charAt(i) != '0') {
                                    ans = '>';
                                    break;
                                }
                            }
                        } else {
                            for (int i = size; i < p.length(); i++) {
                                if (p.charAt(i) != '0') {
                                    ans = '<';
                                    break;
                                }
                            }
                        }
                    }
                    System.out.println(ans);
                }
            }
        } else {
            if (p1 == p2) System.out.println("=");
            else System.out.println(p1 > p2 ? ">" : "<");
        }
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
    }
}
