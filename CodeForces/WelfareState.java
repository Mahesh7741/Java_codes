import java.util.*;

public class WelfareState {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] V = new int[n];
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }

        int[] tree = new int[4 * n];
        buildTree(tree, V, 0, n - 1, 1);

        int q = sc.nextInt();
        while (q-- > 0) {
            int op = sc.nextInt();
            if (op == 1) {
                int index = sc.nextInt() - 1;
                int value = sc.nextInt();
                updateTree(tree, value, index, index, 0, n - 1, 1, true);
            } else if (op == 2) {
                int value = sc.nextInt();
                updateTree(tree, value, 0, n - 1, 0, n - 1, 1, false);
            } else {
                throw new IllegalArgumentException("Invalid operation");
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(queryTree(tree, i, i, 0, n - 1, 1) + " ");
        }
        System.out.println();
    }

    private static void buildTree(int[] tree, int[] v, int st, int sp, int node) {
        if (st == sp) {
            tree[node] = v[st];
            return;
        }
        int mid = st + (sp - st) / 2;
        int left = node * 2;
        int right = left + 1;

        buildTree(tree, v, st, mid, left);
        buildTree(tree, v, mid + 1, sp, right);
    }

    private static void updateTree(int[] tree, int value, int l, int r, int st, int sp, int node, boolean flag) {
        if (st > r || sp < l) return;

        if (st >= l && sp <= r) {
            if (flag) {
                tree[node] = value;
            } else {
                tree[node] = Math.max(tree[node], value);
            }
            return;
        }

        int mid = st + (sp - st) / 2;
        int left = node * 2;
        int right = left + 1;

        tree[left] = Math.max(tree[node], tree[left]);
        tree[right] = Math.max(tree[node], tree[right]);
        tree[node] = 0;

        updateTree(tree, value, l, r, st, mid, left, flag);
        updateTree(tree, value, l, r, mid + 1, sp, right, flag);
    }

    private static int queryTree(int[] tree, int l, int r, int st, int sp, int node) {
        if (st > r || sp < l) return 0;

        if (st >= l && sp <= r) {
            return tree[node];
        }

        int mid = st + (sp - st) / 2;
        int left = node * 2;
        int right = left + 1;

        int s1 = queryTree(tree, l, r, st, mid, left);
        int s2 = queryTree(tree, l, r, mid + 1, sp, right);

        return Math.max(Math.max(s1, s2), tree[node]);
    }
}
