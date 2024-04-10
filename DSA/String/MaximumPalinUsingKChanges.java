public class MaximumPalinUsingKChanges {
    public static String maximumPalinUsingKChanges(String str, int k) {
        char[] palin = str.toCharArray();
        int n = str.length();
        int l = 0, r = n - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                char maxChar = (char) Math.max(str.charAt(l), str.charAt(r));
                palin[l] = maxChar;
                palin[r] = maxChar;
                k--;
            }
            l++;
            r--;
        }

        if (k < 0) {
            return "Not possible";
        }

        l = 0;
        r = n - 1;

        while (l <= r) {
            if (l == r) {
                if (k > 0) {
                    palin[l] = '9';
                }
            }
            if (palin[l] < '9') {
                if (k >= 2 && palin[l] == str.charAt(l) && palin[r] == str.charAt(r)) {
                    k -= 2;
                    palin[l] = '9';
                    palin[r] = '9';
                } else if (k >= 1 && (palin[l] != str.charAt(l) || palin[r] != str.charAt(r))) {
                    k--;
                    palin[l] = '9';
                    palin[r] = '9';
                }
            }
            l++;
            r--;
        }

        return new String(palin);
    }

    public static void main(String[] args) {
        String str = "43435";
        int k = 3;
        System.out.println(maximumPalinUsingKChanges(str, k));
    }
}
