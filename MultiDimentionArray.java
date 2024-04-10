public class MultiDimentionArray {
    public static void main(String arg[]) {
        int num[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = ((i + 1) * 10 + j) + 1;
            }

        }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(num[i][j] + " ");
        // }
        // System.out.print("\n");
        // }

        // other methods to print 2-D arrays

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
