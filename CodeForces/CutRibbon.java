import java.util.*;

public class CutRibbon {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new CutRibbon().solve();
    }

    void solve() {
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            v.add(sc.nextInt());
        }

        Collections.sort(v);

        List<Integer> cts = new ArrayList<>();
        int temp, ct, tct;
        
        if (n % v.get(0) == 0) {
            cts.add(n / v.get(0));
        } else {
            temp = n;
            ct = 0;
            while (temp > 0) {
                temp = temp - v.get(1);
                ct++;
                if (temp % v.get(0) == 0 && temp >= v.get(0)) {
                    ct = ct + temp / v.get(0);
                    temp = temp % v.get(0);
                    break;
                }
            }
            if (temp == 0) {
                cts.add(ct);
            }

            temp = n;
            ct = 0;
            while (temp > 0) {
                temp = temp - v.get(2);
                ct++;
                if (temp % v.get(0) == 0 && temp >= v.get(0)) {
                    ct = ct + temp / v.get(0);
                    temp = temp % v.get(0);
                    break;
                }
            }
            if (temp == 0) {
                cts.add(ct);
            }

            ct = 0;
            while (n > 0) {
                n = n - v.get(2);
                ct++;
                temp = n;
                tct = ct;
                while (temp > 0) {
                    temp = temp - v.get(1);
                    tct++;
                    if (temp % v.get(0) == 0 && temp >= v.get(0)) {
                        tct = tct + temp / v.get(0);
                        temp = temp % v.get(0);
                        break;
                    }
                }
                if (temp == 0) {
                    cts.add(tct);
                }
            }
        }

        int ans = Collections.max(cts);
        System.out.println(ans);
    }
}
