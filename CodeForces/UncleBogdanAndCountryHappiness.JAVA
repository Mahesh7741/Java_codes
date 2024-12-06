import java.io.*;
import java.util.*;

public class UncleBogdanAndCountryHappiness {
    static final int N = (int) 2e5 + 5;
    static int[] h = new int[N];
    static int[] p = new int[N];
    static int[] g = new int[N];
    static List<Integer>[] adj = new ArrayList[N];
    static boolean isPossible;

    public static void dfs(int u, int pr) {
        if ((p[u] + h[u]) % 2 != 0) {
            isPossible = false;
            return;
        }
        g[u] = (p[u] + h[u]) / 2;
        if (g[u] < 0 || g[u] > p[u]) {
            isPossible = false;
            return;
        }

        int dg = 0;
        for (int v : adj[u]) {
            if (v != pr) {
                dfs(v, u);
                if (!isPossible) return;
                dg += g[v];
            }
        }

        if (dg > g[u]) {
            isPossible = false;
        }
    }

    public static void dfsp(int u, int pr) {
        for (int v : adj[u]) {
            if (v != pr) {
                dfsp(v, u);
                p[u] += p[v];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        while (TC-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= n; i++) {
                p[i] = 0;
                h[i] = 0;
                adj[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                adj[a].add(b);
                adj[b].add(a);
            }

            isPossible = true;
            dfsp(1, 0);
            dfs(1, 0);

            if (isPossible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
