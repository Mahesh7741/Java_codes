import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class GoldMedal {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        long T = sc.nextLong(); 
        while (T-- > 0) {
            long n = sc.nextLong(); 
            long k = sc.nextLong(); 
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextLong();
            }
            long additionalValue = sc.nextLong();
            int result = (sum + additionalValue) / k;
            System.out.println(result);
        }
        sc.close();
    }
  public static class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    int[] readArray(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    long[] readLongArray(int n) {
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void close() {
        try {
            br.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


}
